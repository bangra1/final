/**


 *  Copyright (C) 2002-2015  The FreeCol Team
 *
 *  This file is part of FreeCol.
 *
 *  FreeCol is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 2 of the License, or
 *  (at your option) any later version.
 *
 *  FreeCol is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with FreeCol.  If not, see <http://www.gnu.org/licenses/>.
 */

package net.sf.freecol.common.i18n;

import java.awt.List;
import java.io.File;
import java.io.FileInputStream;

import org.w3c.dom.Element;

import net.sf.freecol.common.FreeColSeed;
import net.sf.freecol.common.ServerInfo;
import net.sf.freecol.common.i18n.Number.Category;
import net.sf.freecol.common.model.AbstractGoods;
import net.sf.freecol.common.model.Game;
import net.sf.freecol.common.model.GoodsType;
import net.sf.freecol.common.model.IndianNationType;
import net.sf.freecol.common.model.ResourceType;
import net.sf.freecol.common.model.Specification;
import net.sf.freecol.common.model.Tile;
import net.sf.freecol.util.test.FreeColTestCase;


public class CLDRTest extends FreeColTestCase {

    public void testRuleParsing() {
        Rule rule = new Rule("n mod 10 in 2..4 and n mod 100 not in 12..14");
        assertTrue(rule.matches(2));
        assertTrue(rule.matches(102));
        assertTrue(rule.matches(103));
        assertFalse(rule.matches(1));
        assertFalse(rule.matches(5));
        assertFalse(rule.matches(112));
        
        DefaultNumberRule arabic = new DefaultNumberRule();
        arabic.addRule(Category.zero, "n is 0");
        arabic.addRule(Category.one, "n is 1");
        arabic.addRule(Category.two, "n is 2");
        arabic.addRule(Category.few, "N Mod 100 in 3.. 10");
        arabic.addRule(Category.many, "n MOD 100 in 11   ..99");
        
        assertEquals(Category.zero, arabic.getCategory(0));
        assertEquals(Category.one, arabic.getCategory(1));
        assertEquals(Category.two, arabic.getCategory(2));
        assertEquals(Category.few, arabic.getCategory(3));
        assertEquals(Category.few, arabic.getCategory(7));
        assertEquals(Category.few, arabic.getCategory(10));
        assertEquals(Category.many, arabic.getCategory(11));
        assertEquals(Category.many, arabic.getCategory(99));
        assertEquals(Category.many, arabic.getCategory(2345));
    }

    public void testPlurals() {
        FileInputStream in = null;
        File inputFile = new File("data/strings/plurals.xml");
        assertTrue(inputFile.exists());
        try {
            in = new FileInputStream(inputFile);
        } catch (Exception e) {
            fail("Failed to open input stream.");
        }
        try {
            in.close();
        } catch (Exception e) {
            fail("Failed to close input stream.");
        }

        assertNotNull(NumberRules.getNumberForLanguage("az"));
        assertTrue(NumberRules.getNumberForLanguage("az") instanceof OtherNumberRule);

        assertNotNull(NumberRules.getNumberForLanguage("ko"));
        assertTrue(NumberRules.getNumberForLanguage("ko") instanceof OtherNumberRule);

        assertNotNull(NumberRules.getNumberForLanguage("th"));
        assertTrue(NumberRules.getNumberForLanguage("th") instanceof OtherNumberRule);

        assertNotNull(NumberRules.getNumberForLanguage("en"));
        assertTrue(NumberRules.getNumberForLanguage("en") instanceof PluralNumberRule);

        assertNotNull(NumberRules.getNumberForLanguage("it"));
        assertTrue(NumberRules.getNumberForLanguage("it") instanceof PluralNumberRule);

        assertNotNull(NumberRules.getNumberForLanguage("pt"));
        assertTrue(NumberRules.getNumberForLanguage("pt") instanceof PluralNumberRule);

        assertNotNull(NumberRules.getNumberForLanguage("ak"));
        assertTrue(NumberRules.getNumberForLanguage("ak") instanceof ZeroOneNumberRule);

        assertNotNull(NumberRules.getNumberForLanguage("hi"));
        assertTrue(NumberRules.getNumberForLanguage("hi") instanceof ZeroOneNumberRule);

        assertNotNull(NumberRules.getNumberForLanguage("wa"));
        assertTrue(NumberRules.getNumberForLanguage("wa") instanceof ZeroOneNumberRule);

        assertNotNull(NumberRules.getNumberForLanguage("ga"));
        assertTrue(NumberRules.getNumberForLanguage("ga") instanceof DualNumberRule);

        assertNotNull(NumberRules.getNumberForLanguage("smi"));
        assertTrue(NumberRules.getNumberForLanguage("smi") instanceof DualNumberRule);

        assertNotNull(NumberRules.getNumberForLanguage("sms"));
        assertTrue(NumberRules.getNumberForLanguage("sms") instanceof DualNumberRule);
    }
    
    public void testFreeColSeed_1()
    		throws Exception {
    		FreeColSeed result = new FreeColSeed();
    		assertNotNull(result);
    		// add additional test code here
    	}
    
    
    	
    	public void testGetFreeColSeed_1()
    		throws Exception {
    		boolean generate = true;
    
    		long result = FreeColSeed.getFreeColSeed(generate);
   
    	
    		assertNotNull(result);
    	}
    	
    	public void testServerInfo_1()
    	 		throws Exception {
    	 
    	 		ServerInfo result = new ServerInfo();
    	 
    	 		// add additional test code here
    	 		assertNotNull(result);
    	 		assertEquals("null(null:0) 0, 0, false, null, 0", result.toString());
    	 		assertEquals(null, result.getAddress());
    	 		assertEquals(null, result.getName());
    	 		assertEquals(0, result.getPort());
    	 		assertEquals(null, result.getVersion());
    	 		assertEquals(0, result.getGameState());
    	 		assertEquals(0, result.getSlotsAvailable());
    	 		assertEquals(0, result.getCurrentlyPlaying());
    	 	}
    	
    	
    	 	public void testGetRegionNames_1()
    	 		throws Exception {
    	 		IndianNationType fixture = new IndianNationType("", new Specification());
    	 
    	 	java.util.List<String> result = fixture.getRegionNames();
    	 
    	 		// add additional test code here
    	 		assertNotNull(result);
    	 		assertEquals(0, result.size());
    	 	}
    	 	
    	 	public void testIndianNationType_1()
    	 	 		throws Exception {
    	 	 		String id = "";
    	 	 		Specification specification = new Specification();
    	 	 
    	 	 		IndianNationType result = new IndianNationType(id, specification);
    	 	 
    	 	 		// add additional test code here
    	 	 		assertNotNull(result);
    	 	 		assertEquals(false, result.isEuropean());
    	 	 		assertEquals(false, result.isREF());
    	 	 		assertEquals(true, result.isIndian());
    	 	 		assertEquals("indian-nation-type", result.getXMLTagName());
    	 	 		assertEquals(null, result.getCapitalType());
    	 	 		assertEquals("", result.toString());
    	 	 		assertEquals(".description", result.getDescriptionKey());
    	 	 		assertEquals(".name", result.getNameKey());
    	 	 		assertEquals(false, result.isAbstractType());
    	 	 		assertEquals("", result.getId());
    	 	 		assertEquals("", result.getSuffix());
    	 	 		assertEquals("<indian-nation-type id=\"\" number-of-settlements=\"average\" aggression=\"average\"></indian-nation-type>", result.serialize());
    	 	
    	 	 		assertEquals("", result.getIdType());
    	 	 		assertEquals(-1, result.getIdNumber());
    	 	 	}
    	
    	public void testGetAddress_1()
    	 		throws Exception {
    	 		ServerInfo fixture = new ServerInfo();
    	 		fixture.update("", "", 1, 1, 1, true, "", 1);
    	 
    	 		String result = fixture.getAddress();
    	 
    	 	
    	 		assertEquals("", result);
    	 	}
    	
    	public void testGetCurrentlyPlaying_1()
    			throws Exception {
    	 		ServerInfo fixture = new ServerInfo();
    	 		fixture.update("", "", 1, 1, 1, true, "", 1);
    	 
    	 		int result = fixture.getCurrentlyPlaying();
    	 
    	 		// add additional test code here
    	 		assertEquals(1, result);
    	 	}
    	
    	public void testGetCurrentlyPlaying_2()
    			throws Exception {
    	 		ServerInfo fixture = new ServerInfo();
    	 		fixture.update("", "", 1, 1, 1, true, "", 1);
    	 
    	 		String result = ServerInfo.getXMLElementTagName();
    	 
    	
    	 		// add additional test code here
    	 		assertNotNull(result);
    	 	}
    	
    	
    	public void testGetBestGoodsType_2()
    	 		throws Exception {
    	 		ResourceType fixture = new ResourceType("", new Specification());
    	 
    	 		GoodsType result = fixture.getBestGoodsType();
    	 
    	 		assertEquals(null, result);
    	 	}

    	
    	public void testGetMaxValue_1()
    	 		throws Exception {
    	 		ResourceType fixture = new ResourceType("", new Specification());
    	 
    	 		int result = fixture.getMaxValue();
    	 
    	 		assertEquals(0, result);
    	 	}
    	
    	
    	public void testGetMinValue_1()
    	 		throws Exception {
    	 		ResourceType fixture = new ResourceType("", new Specification());
    	 
    	 		int result = fixture.getMinValue();
    	 
    	 		assertEquals(0, result);
    	 	}
    	public void testGetTagName_1()
    	 		throws Exception {
    	 
    	 		String result = ResourceType.getXMLElementTagName();
    	 
    	 		// add additional test code here
    	 		assertEquals("resource-type", result);
    	 	}

}


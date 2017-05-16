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

package net.sf.freecol.common.io;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileFilter;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.io.IOException;
import org.junit.*;


import org.junit.Test;

import net.sf.freecol.util.test.FreeColTestCase;


public class ModTest extends FreeColTestCase {

	public void testMakeFileFilter_1()
			throws Exception {
			String requiredFile = "";

			FileFilter result = FreeColDataFile.makeFileFilter(requiredFile);

			// add additional test code here
			assertNotNull(result);
		}


    public void testGetRuleSets() {
        
        Set<String> ids = new HashSet<String>();
        for (FreeColModFile mod : Mods.getRuleSets()) {
            assertNotNull("Null identifier for " + mod, mod.getId());
            ids.add(mod.getId());
        }

        assertTrue(ids.contains("freecol"));
        assertTrue(ids.contains("classic"));
      
        assertFalse(ids.contains("testing"));
    }
    
    public void testMods_1()
    		throws Exception {
    		Mods result = new Mods();
    		assertNotNull(result);
    		
    	}

    	/**
    	 * Run the Collection<FreeColModFile> getAllMods() method test.
    	 *
    	 * @throws Exception
    	 *
    	 * @generatedBy CodePro at 5/16/17 12:31 AM
    	 */
    	@Test
    	public void testGetAllMods_1()
    		throws Exception {

    		Collection<FreeColModFile> result = Mods.getAllMods();

    		
    		assertNotNull(result);
    	
    	}

    	/**
    	 * Run the FreeColModFile getFreeColModFile(String) method test.
    	 *
    	 * @throws Exception
    	 *
    	 * @generatedBy CodePro at 5/16/17 12:31 AM
    	 */
    	@Test
    	public void testGetFreeColModFile_1()
    		throws Exception {
    		String id = "";

    		FreeColModFile result = Mods.getFreeColModFile(id);

    		
    		assertEquals(null, result);
    	}

    	/**
    	 * Run the FreeColModFile getModFile(String) method test.
    	 *
    	 * @throws Exception
    	 *
    	 * @generatedBy CodePro at 5/16/17 12:31 AM
    	 */
    	@Test
    	public void testGetModFile_1()
    		throws Exception {
    		String id = "";

    		FreeColModFile result = Mods.getModFile(id);

    		assertEquals(null, result);
    	}

    	/**
    	 * Run the List<FreeColTcFile> getRuleSets() method test.
    	 *
    	 * @throws Exception
    	 *
    	 * @generatedBy CodePro at 5/16/17 12:31 AM
    	 */
    	@Test
    	public void testGetRuleSets_1()
    		throws Exception {

    		List<FreeColTcFile> result = Mods.getRuleSets();

    	
    		assertNotNull(result);
    	}

    	
    	public void testLoadMods_1()
    		throws Exception {

    		Mods.loadMods();

    
    	}
    	
    	

    	/**
    	 * Run the FileFilter getFileFilter() method test.
    	 *
    	 * @throws Exception
    	 *
    	 * @generatedBy CodePro at 5/16/17 12:31 AM
    	 */
    	@Test
    	public void testGetFileFilter_1()
    		throws Exception {

    		FileFilter result = FreeColSavegameFile.getFileFilter();

    	
    		assertNotNull(result);
    	}

    	
    	public void testGetFileNames_1()
    		throws Exception {
    		String prefix = "";
    		String suffix = "";
    		Locale locale = Locale.getDefault();

    		List<String> result = FreeColDataFile.getFileNames(prefix, suffix, locale);

    	
    		assertNotNull(result);
    		assertEquals(3, result.size());
    		assertTrue(result.contains(""));
    		assertTrue(result.contains("_en"));
    		assertTrue(result.contains("_en_US"));
    	}

    		public void testGetFileNames_2()
    		throws Exception {
    		String prefix = "";
    		String suffix = "";
    		Locale locale = Locale.getDefault();

    		List<String> result = FreeColDataFile.getFileNames(prefix, suffix, locale);

    		
    		assertNotNull(result);
    		assertEquals(3, result.size());
    		assertTrue(result.contains(""));
    		assertTrue(result.contains("_en"));
    		assertTrue(result.contains("_en_US"));
    	}

    
    	
    	@Test
    	public void testGetResourceFileNames_1()
    		throws Exception {

    		List<String> result = FreeColDataFile.getResourceFileNames();

    	
    		assertNotNull(result);
    		assertEquals(3, result.size());
    		assertTrue(result.contains("resources.properties"));
    		assertTrue(result.contains("resources_en.properties"));
    		assertTrue(result.contains("resources_en_US.properties"));
    	}
    	

}

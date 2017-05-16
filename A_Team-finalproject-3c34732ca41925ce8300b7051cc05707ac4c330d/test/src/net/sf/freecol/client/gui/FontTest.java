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

package net.sf.freecol.client.gui;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.geom.GeneralPath;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import net.sf.freecol.client.FreeColClient;
import net.sf.freecol.client.gui.menu.FreeColMenuTest;
import net.sf.freecol.client.gui.panel.AboutPanel;
import net.sf.freecol.client.gui.panel.ClassicMapControls;
import net.sf.freecol.client.gui.panel.ColopediaTreeCellRenderer;
import net.sf.freecol.client.gui.panel.Flag;

import net.sf.freecol.client.gui.panel.MapControls;
import net.sf.freecol.common.model.IndianNationType;
import net.sf.freecol.common.model.Specification;
import net.sf.freecol.util.test.FreeColTestCase;


public class FontTest extends FreeColTestCase {

    private static FileFilter ttfFilter = new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().endsWith(".ttf");
            }
        };

    private static final Map<Character, String> specialCharacters = new HashMap<>();
    static {
        specialCharacters.put('\u00D7', "MULTIPLICATION SIGN");
        specialCharacters.put('\u2192', "RIGHTWARDS ARROW");
        specialCharacters.put('\u271D', "LATIN CROSS");
        specialCharacters.put('\u271E', "SHADOWED WHITE LATIN CROSS");
    }
    
    
    public void testFreeColMenuTest_1()
    		throws Exception {
    		FreeColMenuTest result = new FreeColMenuTest();
    		assertNotNull(result);
    		// add additional test code here
    	}
    
    public void testCreateContentPane_1()
    		throws Exception {
    		FreeColMenuTest fixture = new FreeColMenuTest();
    		fixture.output = new JTextArea();
    		fixture.scrollPane = new JScrollPane();

    		Container result = fixture.createContentPane();

    		// add additional test code here
    		assertNotNull(result);
    		assertEquals(1, result.getComponentCount());
    		assertEquals(0.5f, result.getAlignmentX(), 1.0f);
    		assertEquals(0.5f, result.getAlignmentY(), 1.0f);
    		assertEquals(null, result.getFocusTraversalPolicy());
    		assertEquals(false, result.isFocusCycleRoot());
    		assertEquals(false, result.isValidateRoot());
    		//assertEquals(1, result.countComponents());
    		assertEquals(false, result.isFocusTraversalPolicyProvider());
    		assertEquals(false, result.isFocusTraversalPolicySet());
    		assertEquals("javax.swing.JPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777225,maximumSize=,minimumSize=,preferredSize=]", result.toString());
    		assertEquals(null, result.getName());
    		assertEquals(null, result.getParent());
    		assertEquals(true, result.isOpaque());
    		assertEquals(false, result.isValid());
    		assertEquals(0, result.getY());
    		assertEquals(true, result.isEnabled());
    		assertEquals(false, result.requestFocusInWindow());
    		assertEquals(null, result.getInputContext());
    		assertEquals(0, result.getWidth());
    		assertEquals(false, result.hasFocus());
    		assertEquals(false, result.isShowing());
    		assertEquals(true, result.isVisible());
    		assertEquals(null, result.getMousePosition());
    		assertEquals(null, result.getGraphics());
    		assertEquals(null, result.getFocusCycleRootAncestor());
    	//	assertEquals(null, result.getPeer());
    		assertEquals(false, result.isDisplayable());
    		assertEquals(true, result.isDoubleBuffered());
    		assertEquals(false, result.isMaximumSizeSet());
    		assertEquals(false, result.isMinimumSizeSet());
    		assertEquals(false, result.isPreferredSizeSet());
    		assertEquals(0, result.getX());
    		assertEquals(0, result.getHeight());
    		assertEquals(null, result.getGraphicsConfiguration());
    		assertEquals(false, result.isFocusOwner());
    		assertEquals(true, result.isFocusable());
    		assertEquals(false, result.isLightweight());
    		assertEquals(null, result.getDropTarget());
    		assertEquals(true, result.getFocusTraversalKeysEnabled());
    		assertEquals(false, result.getIgnoreRepaint());
    		assertEquals(null, result.getInputMethodRequests());
    		assertEquals(true, result.isBackgroundSet());
    		assertEquals(false, result.isCursorSet());
    
    		assertEquals(true, result.isFontSet());
    		assertEquals(true, result.isForegroundSet());
    	}
    
    public void testGetClassName_1()
    		throws Exception {
    		FreeColMenuTest fixture = new FreeColMenuTest();
    		fixture.output = new JTextArea();
    		fixture.scrollPane = new JScrollPane();
    		Object o = new Object();

    		String result = fixture.getClassName(o);

    		// add additional test code here
    		assertEquals("Object", result);
    	}

    	/**
    	 * Run the void itemStateChanged(ItemEvent) method test.
    	 *
    	 * @throws Exception
    	 *
    	 * @generatedBy CodePro at 5/16/17 1:20 AM
    	 */
    	
    	/**
    	 * Run the void itemStateChanged(ItemEvent) method test.
    	 *
    	 * @throws Exception
    	 *
    	 * @generatedBy CodePro at 5/16/17 1:20 AM
    	 */

    	@Test
    	public void testMain_1()
    		throws Exception {
    		String[] args = new String[] {};

    		FreeColMenuTest.main(args);

    		// add additional test code here
    	}

    
    public void testLogicalSerif() {

        try {
            Font font = new Font("Serif", Font.PLAIN, 1);
            assertNotNull(font);
            for (Map.Entry<Character, String> entry : specialCharacters.entrySet()) {
                assertTrue(font.getName() + " can not display " + entry.getValue(),
                           font.canDisplay(entry.getKey()));
            }
        } catch (Exception e) {
            fail(e.toString());
        }
    }

    public void testFlag_1()
    		throws Exception {
    		Flag.Background background = Flag.Background.FESSES;
    		Flag.Decoration decoration = Flag.Decoration.BEND;
    		Flag.UnionPosition unionPosition = Flag.UnionPosition.BOTTOM;

    		Flag result = new Flag(background, decoration, unionPosition);

    		// add additional test code here
    		assertNotNull(result);
    		assertEquals(13, result.getStars());
    		assertEquals(13, result.getStripes());
    	}

    public void testGetBackground_1()
    		throws Exception {
    		Flag fixture = new Flag(Flag.Background.FESSES, Flag.Decoration.BEND, Flag.UnionPosition.BOTTOM, Flag.UnionShape.BEND);
    		fixture.setDecorationColor(new Color(1));
    		fixture.setUnionColor(new Color(1));
    		fixture.setStarColor(new Color(1));
    		fixture.setStars(1);
    		fixture.setStripes(1);
    		fixture.setBackgroundColors(new ArrayList<Color>());

    		Flag.Background result = fixture.getBackground();

    		// add additional test code here
    		assertNotNull(result);
    		assertEquals("FESSES", result.name());
    		assertEquals("FESSES", result.toString());
    		assertEquals(3, result.ordinal());
    	}
    
    public void testGetBackgroundColors_1()
    		throws Exception {
    		Flag fixture = new Flag(Flag.Background.FESSES, Flag.Decoration.BEND, Flag.UnionPosition.BOTTOM, Flag.UnionShape.BEND);
    		fixture.setDecorationColor(new Color(1));
    		fixture.setUnionColor(new Color(1));
    		fixture.setStarColor(new Color(1));
    		fixture.setStars(1);
    		fixture.setStripes(1);
    		fixture.setBackgroundColors(new ArrayList<Color>());

    		List<Color> result = fixture.getBackgroundColors();

    		// add additional test code here
    		assertNotNull(result);
    		assertEquals(0, result.size());
    	}
    
    public void testGetDecoration_1()
    		throws Exception {
    		Flag fixture = new Flag(Flag.Background.FESSES, Flag.Decoration.BEND, Flag.UnionPosition.BOTTOM, Flag.UnionShape.BEND);
    		fixture.setDecorationColor(new Color(1));
    		fixture.setUnionColor(new Color(1));
    		fixture.setStarColor(new Color(1));
    		fixture.setStars(1);
    		fixture.setStripes(1);
    		fixture.setBackgroundColors(new ArrayList<Color>());

    		Flag.Decoration result = fixture.getDecoration();

    		// add additional test code here
    		assertNotNull(result);
    		assertEquals("BEND", result.name());
    		assertEquals("BEND", result.toString());
    		assertEquals(6, result.ordinal());
    	}
    
    public void testGetDecorationColor_1()
    		throws Exception {
    		Flag fixture = new Flag(Flag.Background.FESSES, Flag.Decoration.BEND, Flag.UnionPosition.BOTTOM, Flag.UnionShape.BEND);
    		fixture.setDecorationColor(new Color(1));
    		fixture.setUnionColor(new Color(1));
    		fixture.setStarColor(new Color(1));
    		fixture.setStars(1);
    		fixture.setStripes(1);
    		fixture.setBackgroundColors(new ArrayList<Color>());

    		Color result = fixture.getDecorationColor();

    		// add additional test code here
    		assertNotNull(result);
    		assertEquals("java.awt.Color[r=0,g=0,b=1]", result.toString());
    		assertEquals(-16777215, result.getRGB());
    		assertEquals(255, result.getAlpha());
    		assertEquals(1, result.getTransparency());
    		assertEquals(0, result.getGreen());
    		assertEquals(1, result.getBlue());
    		assertEquals(0, result.getRed());
    	}

    public void testGetGridOfStars_1()
    		throws Exception {
    		Flag fixture = new Flag(Flag.Background.FESSES, Flag.Decoration.BEND, Flag.UnionPosition.BOTTOM, Flag.UnionShape.BEND);
    		fixture.setDecorationColor(new Color(1));
    		fixture.setUnionColor(new Color(1));
    		fixture.setStarColor(new Color(1));
    		fixture.setStars(1);
    		fixture.setStripes(1);
    		fixture.setBackgroundColors(new ArrayList<Color>());
    		java.awt.geom.Rectangle2D.Double union = new java.awt.geom.Rectangle2D.Double();

    		GeneralPath result = fixture.getGridOfStars(union);

    		// add additional test code here
    		assertNotNull(result);
    		assertEquals(1, result.getWindingRule());
    	}

    	/**
    	 * Run the GeneralPath getGridOfStars(Double) method test.
    	 *
    	 * @throws Exception
    	 *
    	 * @generatedBy CodePro at 5/15/17 8:50 PM
    	 */
    	@Test
    	public void testGetGridOfStars_2()
    		throws Exception {
    		Flag fixture = new Flag(Flag.Background.FESSES, Flag.Decoration.BEND, Flag.UnionPosition.BOTTOM, Flag.UnionShape.BEND);
    		fixture.setDecorationColor(new Color(1));
    		fixture.setUnionColor(new Color(1));
    		fixture.setStarColor(new Color(1));
    		fixture.setStars(1);
    		fixture.setStripes(1);
    		fixture.setBackgroundColors(new ArrayList<Color>());
    		java.awt.geom.Rectangle2D.Double union = new java.awt.geom.Rectangle2D.Double();

    		GeneralPath result = fixture.getGridOfStars(union);

    		// add additional test code here
    		assertNotNull(result);
    		assertEquals(1, result.getWindingRule());
    	}

    	/**
    	 * Run the GeneralPath getGridOfStars(Double) method test.
    	 *
    	 * @throws Exception
    	 *
    	 * @generatedBy CodePro at 5/15/17 8:50 PM
    	 */
    	@Test
    	public void testGetGridOfStars_3()
    		throws Exception {
    		Flag fixture = new Flag(Flag.Background.FESSES, Flag.Decoration.BEND, Flag.UnionPosition.BOTTOM, Flag.UnionShape.BEND);
    		fixture.setDecorationColor(new Color(1));
    		fixture.setUnionColor(new Color(1));
    		fixture.setStarColor(new Color(1));
    		fixture.setStars(0);
    		fixture.setStripes(1);
    		fixture.setBackgroundColors(new ArrayList<Color>());
    		java.awt.geom.Rectangle2D.Double union = new java.awt.geom.Rectangle2D.Double();

    		GeneralPath result = fixture.getGridOfStars(union);

    		// add additional test code here
    		assertNotNull(result);
    		assertEquals(1, result.getWindingRule());
    		assertEquals(null, result.getCurrentPoint());
    	}

    	/**
    	 * Run the GeneralPath getGridOfStars(Double) method test.
    	 *
    	 * @throws Exception
    	 *
    	 * @generatedBy CodePro at 5/15/17 8:50 PM
    	 */
    	
    	@Test
    	public void testGetStar_1()
    		throws Exception {
    		Flag fixture = new Flag(Flag.Background.FESSES, Flag.Decoration.BEND, Flag.UnionPosition.BOTTOM, Flag.UnionShape.BEND);
    		fixture.setDecorationColor(new Color(1));
    		fixture.setUnionColor(new Color(1));
    		fixture.setStarColor(new Color(1));
    		fixture.setStars(1);
    		fixture.setStripes(1);
    		fixture.setBackgroundColors(new ArrayList<Color>());
    		double x = 1.0;
    		double y = 1.0;

    		GeneralPath result = fixture.getStar(x, y);

    		// add additional test code here
    		assertNotNull(result);
    		assertEquals(1, result.getWindingRule());
    	}

    	/**
    	 * Run the GeneralPath getStar(double,double,double) method test.
    	 *
    	 * @throws Exception
    	 *
    	 * @generatedBy CodePro at 5/15/17 8:50 PM
    	 */
    	@Test
    	public void testGetStar_2()
    		throws Exception {
    		Flag fixture = new Flag(Flag.Background.FESSES, Flag.Decoration.BEND, Flag.UnionPosition.BOTTOM, Flag.UnionShape.BEND);
    		fixture.setDecorationColor(new Color(1));
    		fixture.setUnionColor(new Color(1));
    		fixture.setStarColor(new Color(1));
    		fixture.setStars(1);
    		fixture.setStripes(1);
    		fixture.setBackgroundColors(new ArrayList<Color>());
    		double scale = 1.0;
    		double x = 1.0;
    		double y = 1.0;

    		GeneralPath result = fixture.getStar(scale, x, y);

    		// add additional test code here
    		assertNotNull(result);
    		assertEquals(1, result.getWindingRule());
    	}

    	/**
    	 * Run the GeneralPath getStar(double,double,double) method test.
    	 *
    	 * @throws Exception
    	 *
    	 * @generatedBy CodePro at 5/15/17 8:50 PM
    	 */
    	@Test
    	public void testGetStar_3()
    		throws Exception {
    		Flag fixture = new Flag(Flag.Background.FESSES, Flag.Decoration.BEND, Flag.UnionPosition.BOTTOM, Flag.UnionShape.BEND);
    		fixture.setDecorationColor(new Color(1));
    		fixture.setUnionColor(new Color(1));
    		fixture.setStarColor(new Color(1));
    		fixture.setStars(1);
    		fixture.setStripes(1);
    		fixture.setBackgroundColors(new ArrayList<Color>());
    		double scale = -4.9E-324;
    		double x = 1.0;
    		double y = 1.0;

    		GeneralPath result = fixture.getStar(scale, x, y);

    		// add additional test code here
    		assertNotNull(result);
    		assertEquals(1, result.getWindingRule());
    	}

    	/**
    	 * Run the Color getStarColor() method test.
    	 *
    	 * @throws Exception
    	 *
    	 * @generatedBy CodePro at 5/15/17 8:50 PM
    	 */
    	@Test
    	public void testGetStarColor_1()
    		throws Exception {
    		Flag fixture = new Flag(Flag.Background.FESSES, Flag.Decoration.BEND, Flag.UnionPosition.BOTTOM, Flag.UnionShape.BEND);
    		fixture.setDecorationColor(new Color(1));
    		fixture.setUnionColor(new Color(1));
    		fixture.setStarColor(new Color(1));
    		fixture.setStars(1);
    		fixture.setStripes(1);
    		fixture.setBackgroundColors(new ArrayList<Color>());

    		Color result = fixture.getStarColor();

    		// add additional test code here
    		assertNotNull(result);
    		assertEquals("java.awt.Color[r=0,g=0,b=1]", result.toString());
    		assertEquals(-16777215, result.getRGB());
    		assertEquals(255, result.getAlpha());
    		assertEquals(1, result.getTransparency());
    		assertEquals(0, result.getGreen());
    		assertEquals(1, result.getBlue());
    		assertEquals(0, result.getRed());
    	}

    	/**
    	 * Run the int getStars() method test.
    	 *
    	 * @throws Exception
    	 *
    	 * @generatedBy CodePro at 5/15/17 8:50 PM
    	 */
    	@Test
    	public void testGetStars_1()
    		throws Exception {
    		Flag fixture = new Flag(Flag.Background.FESSES, Flag.Decoration.BEND, Flag.UnionPosition.BOTTOM, Flag.UnionShape.BEND);
    		fixture.setDecorationColor(new Color(1));
    		fixture.setUnionColor(new Color(1));
    		fixture.setStarColor(new Color(1));
    		fixture.setStars(1);
    		fixture.setStripes(1);
    		fixture.setBackgroundColors(new ArrayList<Color>());

    		int result = fixture.getStars();

    		// add additional test code here
    		assertEquals(1, result);
    	}

    	/**
    	 * Run the int getStripes() method test.
    	 *
    	 * @throws Exception
    	 *
    	 * @generatedBy CodePro at 5/15/17 8:50 PM
    	 */
    	@Test
    	public void testGetStripes_1()
    		throws Exception {
    		Flag fixture = new Flag(Flag.Background.FESSES, Flag.Decoration.BEND, Flag.UnionPosition.BOTTOM, Flag.UnionShape.BEND);
    		fixture.setDecorationColor(new Color(1));
    		fixture.setUnionColor(new Color(1));
    		fixture.setStarColor(new Color(1));
    		fixture.setStars(1);
    		fixture.setStripes(1);
    		fixture.setBackgroundColors(new ArrayList<Color>());

    		int result = fixture.getStripes();

    		// add additional test code here
    		assertEquals(1, result);
    	}

    	/**
    	 * Run the Color getUnionColor() method test.
    	 *
    	 * @throws Exception
    	 *
    	 * @generatedBy CodePro at 5/15/17 8:50 PM
    	 */
    	@Test
    	public void testGetUnionColor_1()
    		throws Exception {
    		Flag fixture = new Flag(Flag.Background.FESSES, Flag.Decoration.BEND, Flag.UnionPosition.BOTTOM, Flag.UnionShape.BEND);
    		fixture.setDecorationColor(new Color(1));
    		fixture.setUnionColor(new Color(1));
    		fixture.setStarColor(new Color(1));
    		fixture.setStars(1);
    		fixture.setStripes(1);
    		fixture.setBackgroundColors(new ArrayList<Color>());

    		Color result = fixture.getUnionColor();

    		// add additional test code here
    		assertNotNull(result);
    		assertEquals("java.awt.Color[r=0,g=0,b=1]", result.toString());
    		assertEquals(-16777215, result.getRGB());
    		assertEquals(255, result.getAlpha());
    		assertEquals(1, result.getTransparency());
    		assertEquals(0, result.getGreen());
    		assertEquals(1, result.getBlue());
    		assertEquals(0, result.getRed());
    	}

    	/**
    	 * Run the Flag.UnionPosition getUnionPosition() method test.
    	 *
    	 * @throws Exception
    	 *
    	 * @generatedBy CodePro at 5/15/17 8:50 PM
    	 */
    	@Test
    	public void testGetUnionPosition_1()
    		throws Exception {
    		Flag fixture = new Flag(Flag.Background.FESSES, Flag.Decoration.BEND, Flag.UnionPosition.BOTTOM, Flag.UnionShape.BEND);
    		fixture.setDecorationColor(new Color(1));
    		fixture.setUnionColor(new Color(1));
    		fixture.setStarColor(new Color(1));
    		fixture.setStars(1);
    		fixture.setStripes(1);
    		fixture.setBackgroundColors(new ArrayList<Color>());

    		Flag.UnionPosition result = fixture.getUnionPosition();

    		// add additional test code here
    		assertNotNull(result);
    		assertEquals("BOTTOM", result.name());
    		assertEquals("BOTTOM", result.toString());
    		assertEquals(5, result.ordinal());
    	}

    	/**
    	 * Run the Flag.UnionShape getUnionShape() method test.
    	 *
    	 * @throws Exception
    	 *
    	 * @generatedBy CodePro at 5/15/17 8:50 PM
    	 */
    	@Test
    	public void testGetUnionShape_1()
    		throws Exception {
    		Flag fixture = new Flag(Flag.Background.FESSES, Flag.Decoration.BEND, Flag.UnionPosition.BOTTOM, Flag.UnionShape.BEND);
    		fixture.setDecorationColor(new Color(1));
    		fixture.setUnionColor(new Color(1));
    		fixture.setStarColor(new Color(1));
    		fixture.setStars(1);
    		fixture.setStripes(1);
    		fixture.setBackgroundColors(new ArrayList<Color>());

    		Flag.UnionShape result = fixture.getUnionShape();

    		// add additional test code here
    		assertNotNull(result);
    		assertEquals("BEND", result.name());
    		assertEquals("BEND", result.toString());
    		assertEquals(3, result.ordinal());
    	}

    	/**
    	 * Run the Flag setBackground(Background) method test.
    	 *
    	 * @throws Exception
    	 *
    	 * @generatedBy CodePro at 5/15/17 8:50 PM
    	 */
    	@Test
    	public void testSetBackground_1()
    		throws Exception {
    		Flag fixture = new Flag(Flag.Background.FESSES, Flag.Decoration.BEND, Flag.UnionPosition.BOTTOM, Flag.UnionShape.BEND);
    		fixture.setDecorationColor(new Color(1));
    		fixture.setUnionColor(new Color(1));
    		fixture.setStarColor(new Color(1));
    		fixture.setStars(1);
    		fixture.setStripes(1);
    		fixture.setBackgroundColors(new ArrayList<Color>());
    		Flag.Background background = Flag.Background.FESSES;

    		Flag result = fixture.setBackground(background);

    		// add additional test code here
    		assertNotNull(result);
    		assertEquals(1, result.getStars());
    		assertEquals(1, result.getStripes());
    	}

    	/**
    	 * Run the Flag setBackgroundColors(List<Color>) method test.
    	 *
    	 * @throws Exception
    	 *
    	 * @generatedBy CodePro at 5/15/17 8:50 PM
    	 */
    	@Test
    	public void testSetBackgroundColors_1()
    		throws Exception {
    		Flag fixture = new Flag(Flag.Background.FESSES, Flag.Decoration.BEND, Flag.UnionPosition.BOTTOM, Flag.UnionShape.BEND);
    		fixture.setDecorationColor(new Color(1));
    		fixture.setUnionColor(new Color(1));
    		fixture.setStarColor(new Color(1));
    		fixture.setStars(1);
    		fixture.setStripes(1);
    		fixture.setBackgroundColors(new ArrayList<Color>());
    		List<Color> backgroundColors = new ArrayList<Color>();

    		Flag result = fixture.setBackgroundColors(backgroundColors);

    		// add additional test code here
    		assertNotNull(result);
    		assertEquals(1, result.getStars());
    		assertEquals(1, result.getStripes());
    	}

    	/**
    	 * Run the Flag setBackgroundColors(Color[]) method test.
    	 *
    	 * @throws Exception
    	 *
    	 * @generatedBy CodePro at 5/15/17 8:50 PM
    	 */
    	@Test
    	public void testSetBackgroundColors_2()
    		throws Exception {
    		Flag fixture = new Flag(Flag.Background.FESSES, Flag.Decoration.BEND, Flag.UnionPosition.BOTTOM, Flag.UnionShape.BEND);
    		fixture.setDecorationColor(new Color(1));
    		fixture.setUnionColor(new Color(1));
    		fixture.setStarColor(new Color(1));
    		fixture.setStars(1);
    		fixture.setStripes(1);
    		fixture.setBackgroundColors(new ArrayList<Color>());

    		Flag result = fixture.setBackgroundColors();

    		// add additional test code here
    		assertNotNull(result);
    		assertEquals(1, result.getStars());
    		assertEquals(1, result.getStripes());
    	}

    	/**
    	 * Run the Flag setBackgroundColors(Color[]) method test.
    	 *
    	 * @throws Exception
    	 *
    	 * @generatedBy CodePro at 5/15/17 8:50 PM
    	 */
    	@Test
    	public void testSetBackgroundColors_3()
    		throws Exception {
    		Flag fixture = new Flag(Flag.Background.FESSES, Flag.Decoration.BEND, Flag.UnionPosition.BOTTOM, Flag.UnionShape.BEND);
    		fixture.setDecorationColor(new Color(1));
    		fixture.setUnionColor(new Color(1));
    		fixture.setStarColor(new Color(1));
    		fixture.setStars(1);
    		fixture.setStripes(1);
    		fixture.setBackgroundColors(new ArrayList<Color>());

    		Flag result = fixture.setBackgroundColors();

    		// add additional test code here
    		assertNotNull(result);
    		assertEquals(1, result.getStars());
    		assertEquals(1, result.getStripes());
    	}

    	/**
    	 * Run the Flag setBackgroundColors(Color[]) method test.
    	 *
    	 * @throws Exception
    	 *
    	 * @generatedBy CodePro at 5/15/17 8:50 PM
    	 */
    	@Test
    	public void testSetBackgroundColors_4()
    		throws Exception {
    		Flag fixture = new Flag(Flag.Background.FESSES, Flag.Decoration.BEND, Flag.UnionPosition.BOTTOM, Flag.UnionShape.BEND);
    		fixture.setDecorationColor(new Color(1));
    		fixture.setUnionColor(new Color(1));
    		fixture.setStarColor(new Color(1));
    		fixture.setStars(1);
    		fixture.setStripes(1);
    		fixture.setBackgroundColors(new ArrayList<Color>());

    		Flag result = fixture.setBackgroundColors();

    		// add additional test code here
    		assertNotNull(result);
    		assertEquals(1, result.getStars());
    		assertEquals(1, result.getStripes());
    	}

    	/**
    	 * Run the Flag setDecoration(Decoration) method test.
    	 *
    	 * @throws Exception
    	 *
    	 * @generatedBy CodePro at 5/15/17 8:50 PM
    	 */
    	@Test
    	public void testSetDecoration_1()
    		throws Exception {
    		Flag fixture = new Flag(Flag.Background.FESSES, Flag.Decoration.BEND, Flag.UnionPosition.BOTTOM, Flag.UnionShape.BEND);
    		fixture.setDecorationColor(new Color(1));
    		fixture.setUnionColor(new Color(1));
    		fixture.setStarColor(new Color(1));
    		fixture.setStars(1);
    		fixture.setStripes(1);
    		fixture.setBackgroundColors(new ArrayList<Color>());
    		Flag.Decoration decoration = Flag.Decoration.BEND;

    		Flag result = fixture.setDecoration(decoration);

    		// add additional test code here
    		assertNotNull(result);
    		assertEquals(1, result.getStars());
    		assertEquals(1, result.getStripes());
    	}

    	/**
    	 * Run the Flag setDecorationColor(Color) method test.
    	 *
    	 * @throws Exception
    	 *
    	 * @generatedBy CodePro at 5/15/17 8:50 PM
    	 */
    	@Test
    	public void testSetDecorationColor_1()
    		throws Exception {
    		Flag fixture = new Flag(Flag.Background.FESSES, Flag.Decoration.BEND, Flag.UnionPosition.BOTTOM, Flag.UnionShape.BEND);
    		fixture.setDecorationColor(new Color(1));
    		fixture.setUnionColor(new Color(1));
    		fixture.setStarColor(new Color(1));
    		fixture.setStars(1);
    		fixture.setStripes(1);
    		fixture.setBackgroundColors(new ArrayList<Color>());
    		Color decorationColor = new Color(1);

    		Flag result = fixture.setDecorationColor(decorationColor);

    		// add additional test code here
    		assertNotNull(result);
    		assertEquals(1, result.getStars());
    		assertEquals(1, result.getStripes());
    	}

    	/**
    	 * Run the Flag setStarColor(Color) method test.
    	 *
    	 * @throws Exception
    	 *
    	 * @generatedBy CodePro at 5/15/17 8:50 PM
    	 */
    	@Test
    	public void testSetStarColor_1()
    		throws Exception {
    		Flag fixture = new Flag(Flag.Background.FESSES, Flag.Decoration.BEND, Flag.UnionPosition.BOTTOM, Flag.UnionShape.BEND);
    		fixture.setDecorationColor(new Color(1));
    		fixture.setUnionColor(new Color(1));
    		fixture.setStarColor(new Color(1));
    		fixture.setStars(1);
    		fixture.setStripes(1);
    		fixture.setBackgroundColors(new ArrayList<Color>());
    		Color starColor = new Color(1);

    		Flag result = fixture.setStarColor(starColor);

    		// add additional test code here
    		assertNotNull(result);
    		assertEquals(1, result.getStars());
    		assertEquals(1, result.getStripes());
    	}

    	/**
    	 * Run the Flag setStars(int) method test.
    	 *
    	 * @throws Exception
    	 *
    	 * @generatedBy CodePro at 5/15/17 8:50 PM
    	 */
    	@Test
    	public void testSetStars_1()
    		throws Exception {
    		Flag fixture = new Flag(Flag.Background.FESSES, Flag.Decoration.BEND, Flag.UnionPosition.BOTTOM, Flag.UnionShape.BEND);
    		fixture.setDecorationColor(new Color(1));
    		fixture.setUnionColor(new Color(1));
    		fixture.setStarColor(new Color(1));
    		fixture.setStars(1);
    		fixture.setStripes(1);
    		fixture.setBackgroundColors(new ArrayList<Color>());
    		int stars = 1;

    		Flag result = fixture.setStars(stars);

    		// add additional test code here
    		assertNotNull(result);
    		assertEquals(1, result.getStars());
    		assertEquals(1, result.getStripes());
    	}

    	/**
    	 * Run the Flag setStripes(int) method test.
    	 *
    	 * @throws Exception
    	 *
    	 * @generatedBy CodePro at 5/15/17 8:50 PM
    	 */
    	@Test
    	public void testSetStripes_1()
    		throws Exception {
    		Flag fixture = new Flag(Flag.Background.FESSES, Flag.Decoration.BEND, Flag.UnionPosition.BOTTOM, Flag.UnionShape.BEND);
    		fixture.setDecorationColor(new Color(1));
    		fixture.setUnionColor(new Color(1));
    		fixture.setStarColor(new Color(1));
    		fixture.setStars(1);
    		fixture.setStripes(1);
    		fixture.setBackgroundColors(new ArrayList<Color>());
    		int stripes = 1;

    		Flag result = fixture.setStripes(stripes);

    		// add additional test code here
    		assertNotNull(result);
    		assertEquals(1, result.getStars());
    		assertEquals(1, result.getStripes());
    	}

    	/**
    	 * Run the Flag setUnionColor(Color) method test.
    	 *
    	 * @throws Exception
    	 *
    	 * @generatedBy CodePro at 5/15/17 8:50 PM
    	 */
    	@Test
    	public void testSetUnionColor_1()
    		throws Exception {
    		Flag fixture = new Flag(Flag.Background.FESSES, Flag.Decoration.BEND, Flag.UnionPosition.BOTTOM, Flag.UnionShape.BEND);
    		fixture.setDecorationColor(new Color(1));
    		fixture.setUnionColor(new Color(1));
    		fixture.setStarColor(new Color(1));
    		fixture.setStars(1);
    		fixture.setStripes(1);
    		fixture.setBackgroundColors(new ArrayList<Color>());
    		Color unionColor = new Color(1);

    		Flag result = fixture.setUnionColor(unionColor);

    		// add additional test code here
    		assertNotNull(result);
    		assertEquals(1, result.getStars());
    		assertEquals(1, result.getStripes());
    	}

    	/**
    	 * Run the Flag setUnionPosition(UnionPosition) method test.
    	 *
    	 * @throws Exception
    	 *
    	 * @generatedBy CodePro at 5/15/17 8:50 PM
    	 */
    	@Test
    	public void testSetUnionPosition_1()
    		throws Exception {
    		Flag fixture = new Flag(Flag.Background.FESSES, Flag.Decoration.BEND, Flag.UnionPosition.BOTTOM, Flag.UnionShape.BEND);
    		fixture.setDecorationColor(new Color(1));
    		fixture.setUnionColor(new Color(1));
    		fixture.setStarColor(new Color(1));
    		fixture.setStars(1);
    		fixture.setStripes(1);
    		fixture.setBackgroundColors(new ArrayList<Color>());
    		Flag.UnionPosition position = Flag.UnionPosition.BOTTOM;

    		Flag result = fixture.setUnionPosition(position);

    		// add additional test code here
    		assertNotNull(result);
    		assertEquals(1, result.getStars());
    		assertEquals(1, result.getStripes());
    	}

    	/**
    	 * Run the Flag setUnionShape(UnionShape) method test.
    	 *
    	 * @throws Exception
    	 *
    	 * @generatedBy CodePro at 5/15/17 8:50 PM
    	 */
    	@Test
    	public void testSetUnionShape_1()
    		throws Exception {
    		Flag fixture = new Flag(Flag.Background.FESSES, Flag.Decoration.BEND, Flag.UnionPosition.BOTTOM, Flag.UnionShape.BEND);
    		fixture.setDecorationColor(new Color(1));
    		fixture.setUnionColor(new Color(1));
    		fixture.setStarColor(new Color(1));
    		fixture.setStars(1);
    		fixture.setStripes(1);
    		fixture.setBackgroundColors(new ArrayList<Color>());
    		Flag.UnionShape shape = Flag.UnionShape.BEND;

    		Flag result = fixture.setUnionShape(shape);

    		// add additional test code here
    		assertNotNull(result);
    		assertEquals(1, result.getStars());
    		assertEquals(1, result.getStripes());
    	}

    	
    
    
    
    	public void testChoiceItem()
    		throws Exception {
    		String text = "";
    
    		ChoiceItem result = new ChoiceItem(text, null);
    
    		
    		
    		assertNotNull(result);
    		assertEquals("", result.toString());
    		assertEquals(null, result.getObject());
    		assertEquals(false, result.isDefault());
    		assertEquals(true, result.isEnabled());
    		assertEquals(false, result.isOK());
    		assertEquals(null, result.getIcon());
    		
    	}
    	
    	
    	
    	public void testCancelOption_1()
        	 	throws Exception {
        	 		ChoiceItem fixture = new ChoiceItem("", (Object) null, true);
        	 		fixture.setIcon(fixture.getIcon());
        	 
        	 		ChoiceItem<Object> result = fixture.cancelOption();
        	 
        	 		// add additional test code here
        	 		assertNotNull(result);
        	 		assertEquals("", result.toString());
        	 		assertEquals(null, result.getObject());
        	 		assertEquals(false, result.isDefault());
        	 		assertEquals(true, result.isEnabled());
        	 		assertEquals(false, result.isOK());
        	 		assertEquals(true, result.isCancel());
        	 	}
    
    	public void testCompareTo1()
    	 		throws Exception {
    	 		ChoiceItem fixture = new ChoiceItem("", (Object) null, true);
    	 		fixture.setIcon(fixture.getIcon());
    	 		ChoiceItem<Object> other = new ChoiceItem((String) null, (Object) null, true);
    	 
    	 		int result = fixture.compareTo(other);
    	 
    	 		
    	 	assertEquals(1, result);
    	 	}
    	
    	
    	
    	
    	
    	public void testGetObject_1()
    	 	throws Exception {
    	 		ChoiceItem fixture = new ChoiceItem("", (Object) null, true);
    	 		fixture.setIcon(fixture.getIcon());
    	 
    	 		Object result = fixture.getObject();
    	 
    	 		// add additional test code here
    	 		assertEquals(null, result);
    	 	}
    	
    	public void testDefaultOption_1()
    	 		throws Exception {
    	 		ChoiceItem fixture = new ChoiceItem("", (Object) null, true);
    	 		fixture.setIcon(fixture.getIcon());
    	 
    	 		ChoiceItem<Object> result = fixture.defaultOption();
    	 
    	 		// add additional test code here
    	 		assertNotNull(result);
    	 		assertEquals("", result.toString());
    	 		assertEquals(null, result.getObject());
    	 		assertEquals(true, result.isDefault());
    	 		assertEquals(true, result.isEnabled());
    	 		assertEquals(false, result.isOK());
    	 		
    	 	}
    	
    	public void testOkOption_1()
    	 		throws Exception {
    	 		ChoiceItem fixture = new ChoiceItem("", (Object) null, true);
    	 		fixture.setIcon(fixture.getIcon());
    	 
    	 		ChoiceItem<Object> result = fixture.okOption();
    	 
    	 		// add additional test code here
    	 		assertNotNull(result);
    	 		assertEquals("", result.toString());
    	 		assertEquals(null, result.getObject());
    	 		assertEquals(false, result.isDefault());
    	 		assertEquals(true, result.isEnabled());
    	 		assertEquals(true, result.isOK());
    	 		
    	 	}
    	
    	public void testGetIcon_1()
    	 		throws Exception {
    	 		ChoiceItem fixture = new ChoiceItem("", (Object) null, true);
    	 		fixture.setIcon(new ImageIcon());
    	 
    	 		ImageIcon result = fixture.getIcon();
    	 
    	 		// add additional test code here
    	 		assertNotNull(result);
    	 		assertEquals(null, result.getDescription());
    	 		assertEquals(null, result.getImage());
    	 		assertEquals(-1, result.getIconHeight());
    	 		assertEquals(-1, result.getIconWidth());
    	 		assertEquals(0, result.getImageLoadStatus());
    	 		assertEquals(null, result.getImageObserver());
    	 	}
    	
    	public void testIsDefault_2()
    	 	throws Exception {
    	 		ChoiceItem fixture = new ChoiceItem("", (Object) null, true);
    	 		fixture.setIcon(new ImageIcon());
    	 
    	 		boolean result = fixture.isDefault();
    	 
    	 		// add additional test code here
    	 		assertEquals(false, result);
    	 	}
    	
 
    	public void testIsEnabled_1()
    	 		throws Exception {
    	 		ChoiceItem fixture = new ChoiceItem("", (Object) null, true);
    	 		fixture.setIcon(new ImageIcon());
    	 
    	 		boolean result = fixture.isEnabled();
    	 
    	 		// add additional test code here
    	 	assertEquals(true, result);
    	 	}	
    	
    	public void testFrameMotionListener_1()
    	 		throws Exception {
    	 		JInternalFrame f = new JInternalFrame();
    	 
    	 		FrameMotionListener result = new FrameMotionListener(f);
    	 result.mouseDragged(null);
    	 result.mousePressed(null);
    	 	
    	 		assertNotNull(result);
    	 	}
    	
    	public void testTerrainCursor_1()
    	 	throws Exception {
    	 
    	 		TerrainCursor result = new TerrainCursor();
    	 
    	 	
    	 		assertNotNull(result);
    	 		assertEquals(true, result.isActive());
    	 	}
    	
    	public void testFireActionEvent_1()
    	 	throws Exception {
    	 		TerrainCursor fixture = new TerrainCursor();
    	 		fixture.setActive(true);
    	 		ActionEvent ae = new ActionEvent(new Object(), 1, "");
    	 
    	 		fixture.fireActionEvent(ae);
    	 
    	 		
    	 	}
    	
    	public void testIsActive_1()
    	 		throws Exception {
    	 		TerrainCursor fixture = new TerrainCursor();
    	 		fixture.setActive(true);
    	 
    	 		boolean result = fixture.isActive();
    	 
    	 
    	 		assertEquals(true, result);
    	 	}
    	
    	public void testIndianNationType_1()
    	 		throws Exception {
    	 		String id = "";
    	 		Specification specification = new Specification();
    	 
    	 		IndianNationType result = new IndianNationType(id, specification);
    	 
    	 	
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
    	
    	

    	
}

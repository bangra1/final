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

package net.sf.freecol.common.sound;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.Mixer;

import org.junit.Test;

import net.sf.freecol.client.ClientOptions;
import net.sf.freecol.common.io.FreeColDataFile;
import net.sf.freecol.common.io.FreeColDirectories;
import net.sf.freecol.common.io.FreeColTcFile;
import net.sf.freecol.common.model.Specification;
import net.sf.freecol.common.option.AudioMixerOption;
import net.sf.freecol.common.option.PercentageOption;
import net.sf.freecol.common.resources.ResourceManager;
import net.sf.freecol.util.test.FreeColTestCase;


public class SoundTest extends FreeColTestCase {

    private SoundPlayer soundPlayer = null;

    @Override
    public void setUp() {
        ClientOptions clientOptions = new ClientOptions();
        clientOptions.load(FreeColDirectories.getBaseClientOptionsFile());
        final AudioMixerOption amo = (AudioMixerOption) clientOptions.getOption(ClientOptions.AUDIO_MIXER);
        final PercentageOption po = (PercentageOption) clientOptions.getOption(ClientOptions.AUDIO_VOLUME);
        po.setValue(10); // 10% volume
        try {
            soundPlayer = new SoundPlayer(amo, po);
        } catch (Exception e) {
            fail("Could not construct sound player: " + e.getMessage());
        }
        File baseDirectory = FreeColDirectories.getBaseDirectory();
        FreeColDataFile baseData = null;
        try {
            baseData = new FreeColDataFile(baseDirectory);
        } catch (Exception e) {
            fail("Could not load base data: " + e.getMessage());
        }
        ResourceManager.setBaseMapping(baseData.getResourceMapping());
    }

    @Override
    public void tearDown() {
        soundPlayer = null;
    }

    private void playSound(String id) {
        File file = ResourceManager.getAudio(id);
        assertNotNull("No sound resource: " + id, file);
        try {
            soundPlayer.playOnce(file);
            try { // Just play the beginning of the sound to check it works
                Thread.sleep(100);
                soundPlayer.stop();
                Thread.sleep(50);
            } catch (InterruptedException e) {}
        } catch (Exception e) {
            fail("Could not play " + id + ": " + e.getMessage());
        }
    }

    public void testSound() {
        // these sounds are base resources, and should be enough for a test
        playSound("sound.intro.general");
        // other sounds require loading a rule set
    }

    public void testClassic() {
        try {
            FreeColTcFile tcData = new FreeColTcFile("classic");
            ResourceManager.setTcMapping(tcData.getResourceMapping());
        } catch (IOException e) {
            fail("Could not load classic ruleset.");
        }

        playSound("sound.intro.model.nation.english");
        playSound("sound.intro.model.nation.dutch");
        playSound("sound.intro.model.nation.french");
        playSound("sound.intro.model.nation.spanish");
        playSound("sound.anthem.model.nation.dutch");
        playSound("sound.anthem.model.nation.english");
        playSound("sound.anthem.model.nation.french");
        playSound("sound.anthem.model.nation.spanish");
        playSound("sound.attack.artillery");
        playSound("sound.attack.mounted");
        playSound("sound.attack.naval");
        playSound("sound.event.meet.model.nation.aztec");
        playSound("sound.event.illegalMove");
        playSound("sound.event.buildingComplete");
        playSound("sound.event.captureColony");
        playSound("sound.event.fountainOfYouth");
        playSound("sound.event.loadCargo");
        playSound("sound.event.missionEstablished");
        playSound("sound.event.sellCargo");
        playSound("sound.event.shipSunk");
    }
    
    @Test
	public void testOggVorbisDecoderFactory_1()
		throws Exception {

		OggVorbisDecoderFactory result = new OggVorbisDecoderFactory();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the AudioInputStream getOggStream(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/17 1:04 AM
	 */
    public void testPlaylist_1()
    		throws Exception {
    		File soundFile1 = null;

    		Playlist result = new Playlist(soundFile1);

    		// add additional test code here
    		assertNotNull(result);
    		assertEquals(true, result.hasNext());
    		assertEquals(null, result.next());
    	}

    	/**
    	 * Run the Playlist(File[]) constructor test.
    	 *
    	 * @throws Exception
    	 *
    	 * @generatedBy CodePro at 5/16/17 1:04 AM
    	 */
    @Test
	public void testSoundPlayer_1()
		throws Exception {
		AudioMixerOption mixerOption = new AudioMixerOption(new Specification());
		mixerOption.setValue(new net.sf.freecol.common.option.AudioMixerOption.MixerWrapper("", (javax.sound.sampled.Mixer.Info) null));
		PercentageOption volumeOption = new PercentageOption(new Specification());

		SoundPlayer result = new SoundPlayer(mixerOption, volumeOption);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.getVolume());
	}

	/**
	 * Run the SoundPlayer(AudioMixerOption,PercentageOption) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/17 1:04 AM
	 */
	@Test
	public void testSoundPlayer_2()
		throws Exception {
		AudioMixerOption mixerOption = new AudioMixerOption(new Specification());
		mixerOption.setValue(new net.sf.freecol.common.option.AudioMixerOption.MixerWrapper("", (javax.sound.sampled.Mixer.Info) null));
		PercentageOption volumeOption = new PercentageOption(new Specification());

		SoundPlayer result = new SoundPlayer(mixerOption, volumeOption);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.getVolume());
	}

	
	/**
	 * Run the Mixer getMixer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/17 1:04 AM
	 */
	@Test
	public void testGetMixer_1()
		throws Exception {
		AudioMixerOption audioMixerOption = new AudioMixerOption(new Specification());
		audioMixerOption.setValue(new net.sf.freecol.common.option.AudioMixerOption.MixerWrapper("", (javax.sound.sampled.Mixer.Info) null));
		SoundPlayer fixture = new SoundPlayer(audioMixerOption, new PercentageOption(new Specification()));

		Mixer result = fixture.getMixer();

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isOpen());
	}

	/**
	 * Run the int getVolume() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/17 1:04 AM
	 */
	@Test
	public void testGetVolume_1()
		throws Exception {
		AudioMixerOption audioMixerOption = new AudioMixerOption(new Specification());
		audioMixerOption.setValue(new net.sf.freecol.common.option.AudioMixerOption.MixerWrapper("", (javax.sound.sampled.Mixer.Info) null));
		SoundPlayer fixture = new SoundPlayer(audioMixerOption, new PercentageOption(new Specification()));

		int result = fixture.getVolume();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the void playOnce(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/17 1:04 AM
	 */
	@Test
	public void testPlayOnce_1()
		throws Exception {
		AudioMixerOption audioMixerOption = new AudioMixerOption(new Specification());
		audioMixerOption.setValue(new net.sf.freecol.common.option.AudioMixerOption.MixerWrapper("", (javax.sound.sampled.Mixer.Info) null));
		SoundPlayer fixture = new SoundPlayer(audioMixerOption, new PercentageOption(new Specification()));
		File file = new File("");

		fixture.playOnce(file);

		// add additional test code here
	}

	/**
	 * Run the void playOnce(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/17 1:04 AM
	 */
	@Test
	public void testPlayOnce_2()
		throws Exception {
		AudioMixerOption audioMixerOption = new AudioMixerOption(new Specification());
		audioMixerOption.setValue(new net.sf.freecol.common.option.AudioMixerOption.MixerWrapper("", (javax.sound.sampled.Mixer.Info) null));
		SoundPlayer fixture = new SoundPlayer(audioMixerOption, new PercentageOption(new Specification()));
		File file = new File("");

		fixture.playOnce(file);

		// add additional test code here
	}

	/**
	 * Run the void playOnce(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/17 1:04 AM
	 */
	@Test
	public void testPlayOnce_3()
		throws Exception {
		AudioMixerOption audioMixerOption = new AudioMixerOption(new Specification());
		audioMixerOption.setValue(new net.sf.freecol.common.option.AudioMixerOption.MixerWrapper("", (javax.sound.sampled.Mixer.Info) null));
		SoundPlayer fixture = new SoundPlayer(audioMixerOption, new PercentageOption(new Specification()));
		File file = new File("");

		fixture.playOnce(file);

		// add additional test code here
	}

	/**
	 * Run the void stop() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/17 1:04 AM
	 */
	@Test
	public void testStop_1()
		throws Exception {
		AudioMixerOption audioMixerOption = new AudioMixerOption(new Specification());
		audioMixerOption.setValue(new net.sf.freecol.common.option.AudioMixerOption.MixerWrapper("", (javax.sound.sampled.Mixer.Info) null));
		SoundPlayer fixture = new SoundPlayer(audioMixerOption, new PercentageOption(new Specification()));

		fixture.stop();

		// add additional test code here
	}
	
    	@Test
    	public void testPlaylist_3()
    		throws Exception {
    		File[] soundFiles = new File[] {null};
    		int repeatMode = 1;
    		int pickMode = 1;

    		Playlist result = new Playlist(soundFiles, repeatMode, pickMode);

    		// add additional test code here
    		assertNotNull(result);
    		assertEquals(true, result.hasNext());
    		assertEquals(null, result.next());
    	}

    	/**
    	 * Run the Playlist(File[],int,int) constructor test.
    	 *
    	 * @throws Exception
    	 *
    	 * @generatedBy CodePro at 5/16/17 1:04 AM
    	 */
    	@Test
    	public void testPlaylist_4()
    		throws Exception {
    		File[] soundFiles = new File[] {null};
    		int repeatMode = 1;
    		int pickMode = 2;

    		Playlist result = new Playlist(soundFiles, repeatMode, pickMode);

    		// add additional test code here
    		assertNotNull(result);
    		assertEquals(true, result.hasNext());
    		assertEquals(null, result.next());
    	}

    	/**
    	 * Run the Playlist(File[],int,int) constructor test.
    	 *
    	 * @throws Exception
    	 *
    	 * @generatedBy CodePro at 5/16/17 1:04 AM
    	 */
    	@Test
    	public void testPlaylist_5()
    		throws Exception {
    		File[] soundFiles = new File[] {null};
    		int repeatMode = 1;
    		int pickMode = 2;

    		Playlist result = new Playlist(soundFiles, repeatMode, pickMode);

    		// add additional test code here
    		assertNotNull(result);
    		assertEquals(true, result.hasNext());
    		assertEquals(null, result.next());
    	}

    	
}

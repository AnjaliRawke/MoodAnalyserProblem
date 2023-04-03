package com.bridgelabz;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MoodAnalyserTest {
	@Test
	public void testAnalyseMoodSad() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am in sad Mood");
		String mood = moodAnalyser.analyseMood();
		assertEquals("SAD", mood);
	}

	@Test
	public void testAnalyseMoodAny() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Any Mood");
		String mood = moodAnalyser.analyseMood();
		assertEquals("HAPPY", mood);
	}
}

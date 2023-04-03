package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MoodAnalyserTest {
	@Test
	public void testAnalyseMoodSad() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad Mood");
		String mood = moodAnalyser.analyseMood();
		assertEquals("SAD", mood);
	}

	@Test
	public void testAnalyseMoodAny() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Any Mood");
		String mood = moodAnalyser.analyseMood();
		assertEquals("HAPPY", mood);

	}

	@Test
	public void testAnalyseMoodAnyWithConstructor() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Any Mood");
		Assert.assertEquals("HAPPY", moodAnalyser.analyseMood());
	}

	@Test
	public void testAnalyseMoodSadWithConstructor() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad Mood");
		Assert.assertEquals("SAD", moodAnalyser.analyseMood());
	}

	@Test
	public void testAnalyseMoodNull() {
		MoodAnalyser moodAnalyser = new MoodAnalyser(null);
		String mood = moodAnalyser.analyseMood();
		assertEquals("HAPPY", mood);
	}
}
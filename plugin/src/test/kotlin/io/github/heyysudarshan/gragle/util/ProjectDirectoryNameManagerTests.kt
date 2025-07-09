package io.github.heyysudarshan.gragle.util

import kotlin.test.Test
import kotlin.test.assertEquals


class ProjectDirectoryNameManagerTests {

    @Test
    fun testEmptyString() {
        val input = ""

        val expectedResult = ""
        val actualResult = ProjectDirectoryNameManager.getFormattedProjectDirectoryName(projectDirectoryName = input)

        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun testAlreadyCamelCaseString() {
        val input = "alreadyCamelCase"

        val expectedResult = "alreadyCamelCase"
        val actualResult = ProjectDirectoryNameManager.getFormattedProjectDirectoryName(projectDirectoryName = input)

        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun testSimpleKebabCase() {
        val input = "my-project-name"

        val expectedResult = "myProjectName"
        val actualResult = ProjectDirectoryNameManager.getFormattedProjectDirectoryName(projectDirectoryName = input)

        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun testMixedCaseInput() {
        val input = "My-PrOjEcT-NaMe"

        val expectedResult = "myProjectName"
        val actualResult = ProjectDirectoryNameManager.getFormattedProjectDirectoryName(projectDirectoryName = input)

        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun testStringWithNumbers() {
        val input = "project-123-name-4"

        val expectedResult = "project123Name4"
        val actualResult = ProjectDirectoryNameManager.getFormattedProjectDirectoryName(projectDirectoryName = input)

        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun testSingleLetterParts() {
        val input = "a-b-c-d"

        val expectedResult = "aBCD"
        val actualResult = ProjectDirectoryNameManager.getFormattedProjectDirectoryName(projectDirectoryName = input)

        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun testSingleWord() {
        val input = "project"

        val expectedResult = "project"
        val actualResult = ProjectDirectoryNameManager.getFormattedProjectDirectoryName(projectDirectoryName = input)

        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun testSingleWordAllCaps() {
        val input = "PROJECT"

        val expectedResult = "PROJECT"
        val actualResult = ProjectDirectoryNameManager.getFormattedProjectDirectoryName(projectDirectoryName = input)

        assertEquals(expected = expectedResult, actual = actualResult)
    }
}
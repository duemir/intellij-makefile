import com.intellij.testFramework.fixtures.LightPlatformCodeInsightFixtureTestCase

class MakefileFoldingTest : LightPlatformCodeInsightFixtureTestCase() {
  fun testRule() = doTest()

  fun doTest() = myFixture.testFolding("$testDataPath/folding/${getTestName(true)}.mk")

  override fun getTestDataPath() = "testData"
  override fun getBasePath() = "folding"
}
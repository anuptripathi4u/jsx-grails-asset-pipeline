package asset.pipeline.jsx

import grails.test.spock.IntegrationSpec

class JsxProcessorIntegrationSpec extends IntegrationSpec {

    void "Processes jsx"() {
        given:
        def jsxProcessor = new JsxProcessor()
        def file = new File("grails-app/assets/javascripts/test/test.jsx")
        def jsxFile = new JsxAssetFile(file: file)

        when:
        def processedJsx = jsxProcessor.process(jsxFile.file.text, jsxFile)

        then:
        processedJsx == """React.render(
React.createElement("h1", null, "Hello, world!"),
    document.getElementById('example')
);
"""
    }
}

/*
 * Copyright 2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package asset.pipeline.processors

import asset.pipeline.fs.FileSystemAssetResolver
import grails.test.spock.IntegrationSpec

class JsxProcessorSpec extends IntegrationSpec {

    void "Processes jsx"() {
        given:
        def jsxProcessor = new JsxProcessor(null)
        def resolver = new FileSystemAssetResolver('application', 'grails-app/assets')
        def assetFile = resolver.getAsset('test/test.jsx', 'application/javascript')

        when:
        def processedJsx = jsxProcessor.process(assetFile.inputStream.text, assetFile)

        then:
        processedJsx == """React.render(
React.createElement("h1", null, "Hello, world!"),
    document.getElementById('example')
);
"""
    }
}

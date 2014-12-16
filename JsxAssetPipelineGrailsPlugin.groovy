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

import asset.pipeline.AssetHelper
import asset.pipeline.JsxAssetFile

class JsxAssetPipelineGrailsPlugin {
    // the plugin version
    def version = "2.12.1.0"
    // the version or versions of Grails the plugin is designed for
    def grailsVersion = "2.3 > *"
    // resources that are excluded from plugin packaging
    def pluginExcludes = [
        "grails-app/views/error.gsp",
        "grails-app/assets/**"
    ]

    // TODO Fill in these fields
    def title = "Jsx Asset Pipeline Plugin" // Headline display name of the plugin
    def author = "Luis Arias"
    def authorEmail = "luis@balsamiq.com"
    def description = '''\
Implements JSX to JS compilation in the asset-pipeline plugin.
'''

    // URL to the plugin's documentation
    def documentation = "http://grails.org/plugin/jsx-asset-pipeline"

    // Extra (optional) plugin metadata

    // License: one of 'APACHE', 'GPL2', 'GPL3'
    def license = "APACHE"

    // Details of company behind the plugin (if there is one)
    def organization = [ name: "Balsamiq Studios", url: "http://balsamiq.com/" ]

    // Location of the plugin's issue tracker.
    def issueManagement = [ system: "GITHUB", url: "https://github.com/balsamiq/jsx-grails-asset-pipeline/issues" ]

    // Online location of the plugin's browseable source code.
    def scm = [ url: "https://github.com/balsamiq/jsx-grails-asset-pipeline" ]

    def doWithDynamicMethods = { ctx ->
      AssetHelper.assetSpecs << JsxAssetFile
    }
}

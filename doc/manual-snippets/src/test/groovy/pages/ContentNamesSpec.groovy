/*
 * Copyright 2015 the original author or authors.
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
package pages

import geb.Page
import geb.test.GebSpecWithCallbackServer

class ContentNamesSpec extends GebSpecWithCallbackServer {

    def "accessing content names"() {
        expect:
        // tag::usage[]
        to ContentNamesPage
        assert contentNames == ['footer', 'paragraphText'] as Set
        // end::usage[]
    }
}

// tag::page[]
class ContentNamesPage extends Page {
    static content = {
        footer { $("#footer") }
        paragraphText { $("p").text() }
    }
}
// end::page[]

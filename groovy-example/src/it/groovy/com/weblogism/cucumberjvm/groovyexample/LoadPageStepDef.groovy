package com.weblogism.cucumberjvm.groovyexample

import com.weblogism.cucumberjvm.groovyexample.connectors.WebConnector

this.metaClass.mixin(cucumber.api.groovy.Hooks)
this.metaClass.mixin(cucumber.api.groovy.EN)

Before() {
    connector = new WebConnector()
}

After {
    connector.close()
}

Given(~/^I am a user with the splookifying module$/) { ->
}

When(~/^I load the page$/) { ->
    connector.openAndWait('http://localhost:8080/')
}

Then(~/^I should see a greeting$/) { ->
    assert connector.isTextPresent('Hello World')
}

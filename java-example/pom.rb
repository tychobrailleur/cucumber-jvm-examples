project 'Cucumber-jvm Java Example' do

  model_version '4.0.0'
  id 'com.weblogism.cucumberjvm:java-example:1.1.0-SNAPSHOT'
  packaging 'war'

  properties( 'cucumber.options' => '--plugin pretty --tags @wip',
              'project.build.sourceEncoding' => 'UTF-8' )

  jar( 'junit:junit:4.12',
       :scope => 'test' )

  plugin( :compiler, '3.2',
          'source' =>  '1.6',
          'target' =>  '1.6' )

  build do
    final_name 'cuke-jvm-example'
  end

  profile 'integration-tests' do

    activation do
      active_by_default true  end

    properties( 'cucumber.options' => '--plugin html:target/cucumber --tags @wip,@foo' )

    jar( 'info.cukes:cucumber-picocontainer:1.2.2',
         :scope => 'test' )
    jar( 'info.cukes:cucumber-junit:1.2.2',
         :scope => 'test' )
    jar( 'org.seleniumhq.selenium:selenium-java:2.45.0',
         :scope => 'test' )
    jar( 'org.picocontainer:picocontainer:2.15',
         :scope => 'test' )

    plugin 'org.codehaus.mojo:build-helper-maven-plugin:1.9.1' do
      execute_goals( 'add-test-source',
                     :id => 'add-source',
                     :phase => 'generate-sources',
                     'sources' => [ 'src/it/java' ] )
      execute_goals( 'add-test-resource',
                     :id => 'add-resource',
                     :phase => 'generate-sources',
                     'resources' => [ { 'directory' =>  'src/it/resources' } ] )
    end

    plugin( :surefire, '2.18.1',
            'skip' =>  true )
    plugin( :failsafe, '2.18.1',
            'systemPropertyVariables' => {
              'cucumber.options' =>  '${cucumber.options}'
            } ) do
      execute_goals 'integration-test', 'verify'
    end

    plugin( 'org.eclipse.jetty:jetty-maven-plugin:9.3.0.M1',
            'stopKey' =>  'Youllneverwalkalone',
            'stopPort' =>  '9995' ) do
      execute_goals( 'deploy-war',
                     :id => 'start-jetty',
                     :phase => 'pre-integration-test',
                     'daemon' =>  true )
      execute_goals( 'stop',
                     :id => 'stop-jetty',
                     :phase => 'post-integration-test' )
    end

  end

end

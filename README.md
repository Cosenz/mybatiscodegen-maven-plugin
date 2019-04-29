# mybatiscodegen-maven-plugin
Maven plugin for mybatis codegen

Add the plugin to auto generate classes at compile time. 

----
    <plugin>
      <groupId>it.cosenzproject.mybatiscodegen-maven-plugin</groupId>
      <artifactId>mybatiscodegen-maven-plugin</artifactId>
      <version>1.0.0</version>
      <configuration>
        <inputFile>C:/Users/Cosenz/Desktop/a/mapper/ContrattoMapper.xml</inputFile>
  		</configuration>
	    <executions>
	      <execution>
	        <phase>generate-sources</phase>
	        <goals>
	          <goal>mybatiscodegen-maven-plugin</goal>
	        </goals>
	       </execution>
	     </executions>
    </plugin>
----

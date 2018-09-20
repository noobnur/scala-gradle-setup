# scalawithgradle
A skeletal Scala/Gradle project. It includes Scala, ScalaTest, JUnit, [Mockito](http://mockito.org/), and the [gradle-scalatest](https://github.com/maiflai/gradle-scalatest) plugin, as well as [Log4J 1.2](http://wiki.apache.org/logging/log4j1) and a console-only [log4j.xml](src/test/resources/log4j.xml) for testing. 


## Learning Points

Things I've learnt from this project:
1. Problem: Gradle 3.3 not compatible with java 6, need java 7 or more.
Gradle 3.3 requires Java 7 or later to run. You are currently using Java 6.
-- Turns out Java 10 (latest of my updates) is also not good here. Sync worked only when I set the sdk to java 8.
-- I didn't uninstall java 10. File->Other Settings->Default Project Structure and set JDK Location to Java 8.

2. Problem: Java home issue
-- JAVA_HOME is set to an invalid directory: /Library/Java/Home
-- Set Java_Home to libexec instead of Java/Home "export JAVA_HOME=`/usr/libexec/java_home`"

3. Renaming Repo
- Renaming project name (ProjectStructure > project name) won't change the repo folder name.
- Just have to change the project name, close intellij, rename manually using the finder folders, reopen (not import) the project
- Repo name should be different now
- But interestingly, even though the github link is different (ive changed the name of the repo in github also), im still pushing to the original http..
- Ok so looks like it just can happily push correctly. but to change the nameof the repo in github, need to...
```git remote set-url origin new_url```

## Installation

1. create the new repository and copy its URL, e.g. `https://github.com/chronodm/new-project.git`

2. create a 'bare clone' of this this project:

    ```
    git clone --bare https://github.com/chronodm/scala-project-template
    ```

3. cd to the bare clone:

    ```
    cd scala-project-template.git
    ```

4. mirror-push to the new repository

    ```
    git push --mirror https://github.com/chronodm/new-project.git
    ```

5. remove the `scala-project-template.git` directory

    ```
    cd ..; rm -rf scala-project-template.git
    ```

6. clone the new repository and CD to the new directory:

    ```
    git clone https://github.com/chronodm/new-project.git

    cd new-project
    ```
7. remove or edit this README file.
8. edit `build.gradle` to update versions, if you feel like it
9. edit `settings.gradle` file to set the root project name
10. check that everything's working:

    ```
    ./gradlew check
    ```

11. start coding!

plugins {
    id ("java")
}

group "ru.netology"
version "1.0-SNAPSHOT"
java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(11))
}
tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly ("org.junit.jupiter:junit-jupiter-engine:5.8.1")
    testImplementation ("io.rest-assured:rest-assured:4.3.0")
}

tasks.test {
    useJUnit()
}
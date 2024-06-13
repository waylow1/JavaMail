plugins {
    id("org.openjfx.javafxplugin") version "0.0.12"
    application
    id("java")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.google.api-client:google-api-client:2.0.0")
    implementation("com.google.oauth-client:google-oauth-client-jetty:1.34.1")
    implementation("com.google.apis:google-api-services-gmail:v1-rev20220404-2.0.0")
    implementation("org.openjfx:javafx-controls:17")
    implementation("org.openjfx:javafx-fxml:17")
}

javafx {
    version = "19"
    modules("javafx.controls", "javafx.fxml")
}

application {
    mainModule = "fr.javamail"
    mainClass = "fr.javamail.scripts.Main"
}

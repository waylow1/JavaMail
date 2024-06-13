plugins {
    id("org.openjfx.javafxplugin") version "0.0.12"
    id("application")
    id("java")
}

javafx {
    val javafxPath  = "C:\\Program Files\\Java\\javafx-sdk-22.0.1\\lib"
    modules("javafx.controls", "javafx.fxml")
}

group = "org.example"
version = "1.0-SNAPSHOT"

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



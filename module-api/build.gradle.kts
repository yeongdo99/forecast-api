dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation(project(":module-core"))
}

tasks.getByName("bootJar") {
    enabled = true
}

tasks.getByName("jar") {
    enabled = false
}

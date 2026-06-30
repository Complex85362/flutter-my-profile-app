import com.android.build.gradle.AppExtension

val android = project.extensions.getByType(AppExtension::class.java)

android.apply {
    flavorDimensions("flavor-type")

    productFlavors {
        create("dev") {
            dimension = "flavor-type"
            applicationId = "com.example.suvham_shakya_app.dev"
            resValue(type = "string", name = "app_name", value = "Suvham Dev")
        }
        create("staging") {
            dimension = "flavor-type"
            applicationId = "com.example.suvham_shakya_app.staging"
            resValue(type = "string", name = "app_name", value = "Suvham Staging")
        }
        create("prod") {
            dimension = "flavor-type"
            applicationId = "com.example.suvham_shakya_app"
            resValue(type = "string", name = "app_name", value = "Suvham Shakya")
        }
    }

    buildFeatures.resValues = true
}
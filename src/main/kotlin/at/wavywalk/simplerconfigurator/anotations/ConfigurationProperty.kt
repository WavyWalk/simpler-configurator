package at.wavywalk.simplerconfigurator.anotations

@Target(AnnotationTarget.PROPERTY)
annotation class ConfigurationProperty(
    val allowNull: Boolean = false,
    val allowDefault: Boolean = false
)
package travelator

data class CampSite(
    val id: String,
    val name: String,
    val address: Address,
) {
    val countryCode: String
        get() = address.countryCode

    fun region(): String {
        return address.region
    }

}
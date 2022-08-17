package no.nav.familie.kontrakter.ba.tss

data class SøkSamhandlerInfoRequest(
    val navn: String,
    val side: Int = 0
)

data class SøkSamhandlerInfo(
    val finnesMerInfo: Boolean,
    val samhandlere: List<SamhandlerInfo>
)

data class SamhandlerInfo(
    val tssEksternId: String,
    val navn: String,
    val adressser: List<SamhandlerAddresse> = emptyList()
)

data class SamhandlerAddresse(
    val adresselinjer: List<String>,
    val postNr: String,
    val postSted: String,
    val addresseType: String
)
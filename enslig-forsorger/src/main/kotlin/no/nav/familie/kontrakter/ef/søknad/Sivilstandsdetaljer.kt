package no.nav.familie.kontrakter.ef.søknad

import java.time.LocalDate

data class Sivilstandsdetaljer(val giftIUtlandet: Spørsmål<Boolean>?,
                               val giftIUtlandetDokumentasjon: Dokument?,
                               val separertEllerSkiltIUtlandet: Spørsmål<Boolean>?,
                               val separertEllerSkiltIUtlandetDokumentasjon: Dokument?,
                               val søktOmSkilsmisseSeparasjon: Spørsmål<Boolean>?,
                               val søknadsdato: Spørsmål<LocalDate>?,
                               val separasjonsbekreftelse: Dokument?,
                               val årsakEnslig: Spørsmål<String>,
                               val samlivsbruddsdokumentasjon: Dokument?,
                               val samlivsbruddsdato: LocalDate?,
                               val fraflytningsdato: LocalDate?,
                               val spesifikasjonAnnet: String?)
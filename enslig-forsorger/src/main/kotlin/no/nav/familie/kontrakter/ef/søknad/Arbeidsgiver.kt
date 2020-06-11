package no.nav.familie.kontrakter.ef.søknad

import java.time.LocalDate


data class Arbeidsgiver(val arbeidsgivernavn: Søknadsfelt<String>,
                        val arbeidsmengde: Søknadsfelt<Int>,
                        val fastEllerMidlertidig: Søknadsfelt<String>,
                        val harSluttdato: Søknadsfelt<Boolean>?,
                        val sluttdato: Søknadsfelt<LocalDate>? = null)

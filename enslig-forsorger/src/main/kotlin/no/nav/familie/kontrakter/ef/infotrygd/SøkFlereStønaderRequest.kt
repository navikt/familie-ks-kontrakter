package no.nav.familie.kontrakter.ef.infotrygd

import no.nav.familie.kontrakter.ef.felles.StønadType

data class SøkFlereStønaderRequest(val personIdenter: Set<String>,
                                   val stønader: Set<StønadType>)
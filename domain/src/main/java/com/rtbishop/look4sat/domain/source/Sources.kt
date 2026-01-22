package com.rtbishop.look4sat.domain.source

object Sources {
    const val RADIO_DATA_URL = "https://look4sat.xduham.club/api/transmitters/transmitters.json"
    val satelliteDataUrls = mapOf(
        "All" to "https://look4sat.xduham.club/NORAD/elements/active.csv",
        "Amsat" to "https://look4sat.xduham.club/tle/current/nasabare.txt",
        "Amateur" to "https://look4sat.xduham.club/NORAD/elements/amateur.csv",
        "Brightest" to "https://look4sat.xduham.club/NORAD/elements/visual.csv",
        "Classified" to "https://look4sat.xduham.club/tles/classfd.zip",
        "Cubesat" to "https://look4sat.xduham.club/NORAD/elements/cubesat.csv",
        "Education" to "https://look4sat.xduham.club/NORAD/elements/education.csv",
        "Engineer" to "https://look4sat.xduham.club/NORAD/elements/engineering.csv",
        "Geostationary" to "https://look4sat.xduham.club/NORAD/elements/geo.csv",
        "Globalstar" to "https://look4sat.xduham.club/NORAD/elements/globalstar.csv",
        "GNSS" to "https://look4sat.xduham.club/NORAD/elements/gnss.csv",
        "Intelsat" to "https://look4sat.xduham.club/NORAD/elements/intelsat.csv",
        "Iridium" to "https://look4sat.xduham.club/NORAD/elements/iridium-NEXT.csv",
        "McCants" to "https://look4sat.xduham.club/tles/inttles.zip",
        "Military" to "https://look4sat.xduham.club/NORAD/elements/military.csv",
        "New" to "https://look4sat.xduham.club/NORAD/elements/last-30-days.csv",
        "OneWeb" to "https://look4sat.xduham.club/NORAD/elements/oneweb.csv",
        "Orbcomm" to "https://look4sat.xduham.club/NORAD/elements/orbcomm.csv",
        "R4UAB" to "https://look4sat.xduham.club/satonline.txt",
        "Resource" to "https://look4sat.xduham.club/NORAD/elements/resource.csv",
        "SatNOGS" to "https://look4sat.xduham.club/NORAD/elements/satnogs.csv",
        "Science" to "https://look4sat.xduham.club/NORAD/elements/science.csv",
        "Spire" to "https://look4sat.xduham.club/NORAD/elements/spire.csv",
        "Starlink" to "https://look4sat.xduham.club/NORAD/elements/starlink.csv",
        "Swarm" to "https://look4sat.xduham.club/NORAD/elements/swarm.csv",
        "Weather" to "https://look4sat.xduham.club/NORAD/elements/weather.csv",
        "X-Comm" to "https://look4sat.xduham.club/NORAD/elements/x-comm.csv"
    )
}

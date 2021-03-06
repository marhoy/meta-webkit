require wpebackend-rdk.inc

DEFAULT_PREFERENCE = "-1"

DEPENDS = "libwpe glib-2.0 libinput"
PROVIDES += "virtual/wpebackend"
RPROVIDES_${PN} += "virtual/wpebackend"

PV = "git${AUTOREV}"
SRCREV = "${AUTOREV}"

SRC_URI = "git://github.com/WebPlatformForEmbedded/WPEBackend-rdk.git;protocol=https;branch=master"

S = "${WORKDIR}/git"

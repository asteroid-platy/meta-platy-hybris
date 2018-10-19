FILESEXTRAPATHS_prepend_platy := "${THISDIR}/${PN}:"
SRC_URI_append_platy = " file://70-input.rules"

do_install_append_platy() {
	install -m 0644 ${WORKDIR}/70-input.rules ${D}${sysconfdir}/udev/rules.d/70-input.rules
}

FILESEXTRAPATHS_prepend_platy := "${THISDIR}/brcm-patchram-plus:"
SRC_URI_append_platy = " file://patchram.service "
CFLAGS_append_platy = " -DLPM_PLATY"

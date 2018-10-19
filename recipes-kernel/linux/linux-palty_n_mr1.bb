require recipes-kernel/linux/linux.inc
inherit gettext

SECTION = "kernel"
SUMMARY = "Android kernel for the ZTE Quartz"
HOMEPAGE = "https://android.googlesource.com/"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=d7810fab7487fb0aad327b76f1be7cd7"
COMPATIBLE_MACHINE = "platy"

SRC_URI = "git://android.googlesource.com/kernel/msm;branch=android-msm-platy-3.18-nougat-mr1-wear-release;protocol=https \
    file://defconfig \
    file://img_info"
SRCREV = "918d02e37f21948e54bc4b19d0bf3d8cea0d366b"
LINUX_VERSION ?= "3.18"
PV = "${LINUX_VERSION}+nougat"
S = "${WORKDIR}/git"
B = "${S}"

do_install_append() {
    rm -rf ${D}/usr/src/usr/
}

BOOT_PARTITION = "/dev/sda"

inherit mkboot old-kernel-gcc-hdrs

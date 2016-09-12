# Copyright (C) 2016 Renat Gabdulhakov <renat.gabdulhakov@harman.com>
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Simple helloworld application"
SECTION = "examples"
DEPENDS = ""
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"
PR = "r0"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

SRCREV = "master"
SRC_URI = "git://github.com/akrigator/c_hello.git;protocol=https"

S = "${WORKDIR}/git"
EXTRA_OEMAKE = 'all -C ${S}'

inherit autotools

# The autotools configuration I am basing this on seems to have a problem with a race condition when parallel make is enabled
PARALLEL_MAKE = ""


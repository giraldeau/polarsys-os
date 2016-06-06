# Base this image on core-image-minimal
include recipes-core/images/core-image-minimal.bb

# Include modules in rootfs
IMAGE_INSTALL += " \
    dash \
	file \
	ldd \
	libstdc++ \
	screen \
    kernel-modules \
    "

SPLASH = "psplash-raspberrypi"

IMAGE_FEATURES += "ssh-server-dropbear package-management splash"

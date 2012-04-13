;   Copyright (c) deeperbydesign, inc 2012. All rights reserved.
;   The use and distribution terms for this software are covered by the
;   Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php)
;   which can be found in the file epl-v10.html at the root of this distribution.
;   By using this software in any fashion, you are agreeing to be bound by
;   the terms of this license.
;   You must not remove this notice, or any other, from this software.

(ns ^{:doc "Options fn's"
      :author "Kevin Neaton"}
  im4clj.options
  (:use [im4clj.defoptions :only [defoptions]]))

(defoptions
  {:command "gm convert"
   :project "GraphicsMagick"
   :version "1.3.13"}

  -adjoin []
  {:doc "join images into a single multi-image file"}

  -affine [matrix]
  {:doc "drawing transform matrix"}

  -antialias []
  {:doc "remove pixel aliasing"}

  -append []
  {:doc "append a set of images"}

  -asc-cdl [spec]
  {:doc "apply ASC CDL color transform"}

  -authenticate [string]
  {:doc "decrypt image with this password"}

  -average []
  {:doc "average a set of images"}

  -background [color]
  {:doc "the background color"}

  -black-threshold [red ["," green] ["," blue] ["," opacity]]
  {:doc "pixels below the threshold become black"}

  -blue-primary [x "," y]
  {:doc "blue chromaticity primary point"}

  -blur [radius ["x" sigma]]
  {:doc "blur the image with a Gaussian operator"}

  -border [width "x" height]
  {:doc "surround the image with a border of color"}

  -bordercolor [color]
  {:doc "the border color"}

  -box [color]
  {:doc "set the color of the annotation bounding box"}

  -channel [type]
  {:doc "the type of channel"}

  -charcoal [factor]
  {:doc "simulate a charcoal drawing"}

  -chop [width "x" height ["+" x "+" y] [special]]
  {:doc "remove pixels from the interior of an image"}

  -clip []
  {:doc "apply the clipping path, if one is present"}

  -coalesce []
  {:doc "merge a sequence of images"}

  -colorize [value]
  {:doc "colorize the image with the pen color"}

  -colors [value]
  {:doc "preferred number of colors in the image"}

  -colorspace [value]
  {:doc "the type of colorspace"}

  -comment [string]
  {:doc "annotate an image with a comment"}

  -compose [operator]
  {:doc "the type of image composition"}

  -compress [type]
  {:doc "the type of image compression"}

  -contrast []
  {:doc "enhance or reduce the image contrast"}

  -convolve [kernel]
  {:doc "convolve image with the specified convolution kernel"}

  -crop [width "x" height ["+" x "+" y] [special]]
  {:doc "preferred size and location of the cropped image"}

  -cycle [amount]
  {:doc "displace image colormap by amount"}

  -debug [events]
  {:doc "enable debug printout"}

  -deconstruct []
  {:doc "break down an image sequence into constituent parts"}

  -define [key ["=" value]]
  {:doc "add coder/decoder specific options"}

  -delay [hundredths-of-a-second]
  {:doc "display the next image after pausing"}

  -density [width "x" height]
  {:doc "horizontal and vertical resolution in pixels of the image"}

  -depth [value]
  {:doc "depth of the image"}

  -despeckle []
  {:doc "reduce the speckles within an image"}

  -display [host ":" display ["." screen]]
  {:doc "specifies the X server to contact"}

  -dispose [method]
  {:doc "GIF disposal method"}

  -dither []
  {:doc "apply Floyd/Steinberg error diffusion to the image"}

  -draw [string]
  {:doc "annotate an image with one or more graphic primitives"}

  -edge [radius]
  {:doc "detect edges within an image"}

  -emboss [radius]
  {:doc "emboss an image"}

  -encoding [type]
  {:doc "specify the text encoding"}

  -endian [type]
  {:doc "specify endianness (MSB, LSB, or Native) of image"}

  -enhance []
  {:doc "apply a digital filter to enhance a noisy image"}

  -equalize []
  {:doc "perform histogram equalization to the image"}

  -extent [width "x" height ["+" x "+" y]]
  {:doc "composite image on background color canvas image"}

  -fill [color]
  {:doc "color to use when filling a graphic primitive"}

  -filter [type]
  {:doc "use this type of filter when resizing an image"}

  -flatten []
  {:doc "flatten a sequence of images"}

  -flip []
  {:doc "create a \"mirror image\""}

  -flop []
  {:doc "create a \"mirror image\""}

  -font [name]
  {:doc "use this font when annotating the image with text"}

  -frame [width "x" height "+" outer-bevel-width "+" inner-bevel-width]
  {:doc "surround the image with an ornamental border"}

  -fuzz [distance [percent?]]
  {:doc "colors within this Euclidean distance are considered equal"}

  -gamma [value]
  {:doc "level of gamma correction"}

  -gaussian [radius ["x" sigma]]
  {:doc "blur the image with a Gaussian operator"}

  -geometry [width "x" height ["+" x "+" y] [special]]
  {:doc "preferred size and location of the Image window."
   :pre [(#{"%" "@" "!" "^" "<" ">"} special)]}

  -gravity [type]
  {:doc "direction primitive  gravitates to when annotating the image."}

  -green-primary [x "," y]
  {:doc "green chromaticity primary point"}

  -hald-clut [clut]
  {:doc "apply a Hald CLUT to the image"}

  -help []
  {:doc "print usage instructions"}

  -implode [factor]
  {:doc "implode image pixels about the center"}

  -intent [type]
  {:doc "use this type of rendering intent when managing the image color"}

  -interlace [type]
  {:doc "the type of interlacing scheme"}

  -label [name]
  {:doc "assign a label to an image"}

  -lat [width "x" height "+" offset [percent?]]
  {:doc "perform local adaptive thresholding"}

  -level [black-point ["," gamma] ["," white-point] [percent?]]
  {:doc "adjust the level of image contrast"}

  ;; -limit [type] [value]
  ;; {:doc "Disk, File, Map, Memory, Pixels, or Threads resource limit"}

  -list [type]
  {:doc "the type of list"}

  -log [string]
  {:doc "Specify format for debug log"}

  -loop [iterations]
  {:doc "add Netscape loop extension to your GIF animation"}

  -magnify []
  {:doc "magnify the image"}

  -map [filename]
  {:doc "choose a particular set of colors from this image"}

  -mask [filename]
  {:doc "Specify a clipping mask"}

  -matte []
  {:doc "store matte channel if the image has one"}

  -mattecolor [color]
  {:doc "specify the color to be used with the -frame option"}

  -median [radius]
  {:doc "apply a median filter to the image"}

  -minify [factor]
  {:doc "minify the image"}

  -modulate [brightness ["," saturation] ["," hue]]
  {:doc "vary the brightness, saturation, and hue of an image"}

  -monitor []
  {:doc "show progress indication"}

  -monochrome []
  {:doc "transform the image to black and white"}

  -morph [frames]
  {:doc "morphs an image sequence"}

  -mosaic []
  {:doc "create a mosaic from an image or an image sequence"}

  -motion-blur [radius ["x" sigma] ["+" angle]]
  {:doc "Simulate motion blur"}

  -negate []
  {:doc "replace every pixel with its complementary color"}

  -noise [radius-or-type]
  {:doc "add or reduce noise in an image"}

  -noop []
  {:doc "NOOP (no option)"}

  -normalize []
  {:doc "transform image to span the full range of color values"}

  -opaque [color]
  {:doc "change this color to the pen color within the image"}

  -operator [channel operator rvalue [percent?]]
  {:doc "apply a mathematical, bitwise, or value operator to an image channel"}

  -ordered-dither [channeltype n-by-n]
  {:doc "ordered dither the image"}

  -page [width "x" height ["+" x "+" y] [special]]
  {:doc "size and location of an image canvas"
   :post [(#{"%" "!" "<" ">"} special)]}

  -paint [radius]
  {:doc "simulate an oil painting"}

  -pen [color]
  {:doc "(This option has been replaced by the -fill option)"}

  -ping []
  {:doc "efficiently determine image characteristics"}

  -pointsize [value]
  {:doc "pointsize of the PostScript, X11, or TrueType font"}

  -preview [type]
  {:doc "image preview type"}

  -process [command]
  {:doc "process a sequence of images using a process module"}

  -profile [filename]
  {:doc "add ICM, IPTC, or generic profile  to image"}

  -quality [value]
  {:doc "JPEG/MIFF/PNG/TIFF compression level"}

  -raise [width "x" height]
  {:doc "lighten or darken image edges"}

  -random-threshold [channeltype low-x-high]
  {:doc "random threshold the image"}

  -recolor [matrix]
  {:doc "apply a color translation matrix to image channels"}

  -red-primary [x "," y]
  {:doc "red chromaticity primary point"}

  -region [width "x" height ["+" x "+" y]]
  {:doc "apply options to a portion of the image"}

  -render []
  {:doc "render vector operations"}

  -resample [horizontal "x" vertical]
  {:doc "Resample image to specified horizontal and vertical resolution"}

  -resize [width "x" height [special]]
  {:doc "resize an image"
   :pre [(#{"%" "@" "!" "<" ">"} special)]}

  -roll ["+" x "+" y]
  {:doc "roll an image vertically or horizontally"}

  -rotate [degrees [special]]
   {:doc "rotate the image"
    :post [(#{"<" ">"} special)]}

  -sample [geometry]
  {:doc "scale image using pixel sampling"}

  -sampling-factor [horizontal-factor "x" vertical-factor]
  {:doc "chroma subsampling factors"}

  -scale [geometry]
  {:doc "scale the image."}

  -scene [value]
  {:doc "set scene number"}

  ;; -set [attribute] [value]
  ;; {:doc "set an image attribute"}

  -segment [cluster-threshold "x" smoothing-threshold]
  {:doc "segment an image"}

  -shade [azimuth "x" elevation]
  {:doc "shade the image using a distant light source"}

  -sharpen [radius ["x" sigma]]
  {:doc "sharpen the image"}

  -shave [width "x" height [percent?]]
  {:doc "shave pixels from the image edges"}

  -shear [x-degrees "x" y-degrees]
  {:doc "shear the image along the X or Y axis"}

  -size [width "x" height ["+" offset]]
  {:doc "width and height of the image"}

  -solarize [factor]
  {:doc "negate all pixels above the threshold level"}

  -spread [amount]
  {:doc "displace image pixels by a random amount"}

  -stroke [color]
  {:doc "color to use when stroking a graphic primitive"}

  -strokewidth [value]
  {:doc "set the stroke width"}

  -swirl [degrees]
  {:doc "swirl image pixels about the center"}

  -texture [filename]
  {:doc "name of texture to tile onto the image background"}

  -threshold [value [percent?]]
  {:doc "threshold the image"}

  -thumbnail [width "x" height [special]]
   {:doc "resize an image (quickly)"
    :post [(#{"%" "@" "!" "<" ">"} special)]}

  -tile [filename]
  {:doc "tile image when filling a graphic primitive"}

  -transform []
  {:doc "transform the image"}

  -transparent [color]
  {:doc "make this color transparent within the image"}

  -treedepth [value]
  {:doc "tree depth for the color reduction algorithm"}

  -trim []
  {:doc "trim an image"}

  -type [type]
  {:doc "the image type"}

  -units [type]
  {:doc "the units of image resolution"}

  -unsharp [radius ["x" sigma] ["+" amount] ["+" threshold]]
  {:doc "sharpen the image with an unsharp mask operator"}

  -use-pixmap []
  {:doc "use the pixmap"}

  -verbose []
  {:doc "print detailed information about the image"}

  -version []
  {:doc "print GraphicsMagick version string"}

  -view [string]
  {:doc "FlashPix viewing parameters"}

  -virtual-pixel [method]
  {:doc "specify contents of \"virtual pixels\""}

  -wave [amplitude "x" wavelength]
  {:doc "alter an image along a sine wave"}

  -white-point [x "," y]
  {:doc "chromaticity white point"}

  -white-threshold [red ["," green] ["," blue] ["," opacity]]
  {:doc "pixels above the threshold become white"}

  -write [filename]
  {:doc "write an intermediate image [convert, composite]"})

;; TODO: extend argspec to work with multi-word options and get rid of these.
;; TODO: add
(defn -limit
  "Disk, File, Map, Memory, Pixels, or Threads resource limit"
  [type value]
  (list "-limit" type value))

(defn -set
  "set an image attribute"
  ([attribute]
     (list "-set" attribute))
  ([attribute value]
     (list "-set" attribute value)))

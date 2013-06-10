# NOTE

***

`im4clj` is incomplete and is not currently under active development.
I personally, reccomend using a generic shell scripting tool like https://github.com/Raynes/conch instead.
However, `im4clj` does provide some additional niceties like (inline documentation) and will remain here for that purpose.

***

# im4clj

ImageMagick/GraphicsMagick commandline wrapper for Clojure.

_See the [im4clj wiki][wiki] and the im4clj [API docs][API] for more detailed information._

## Example

Crop an image...

```clj
user=> (convert "path/to/image.jpg" (-resize 640 480) "path/to/new-image.jpg")
nil
```

Get documentation...

```clj
user=> (doc -resize)
-------------------------
im4clj.core/-resize
([width height] [width height special])
  resize an image
nil

```

## Install

Install [ImageMagick][IM] or [GraphicsMagick][GM].

Add the following dependency to your `project.clj` file:

    [im4clj "0.0.1"]

## Documentation

* [API docs][API]


## License

Copyright (C) deeperbydesign, inc 2012.

Distributed under the Eclipse Public License, the same as Clojure.

Test images obtained from NASA's website are public domain and not subject to the above copyright notice.

[IM]: http://www.imagemagick.org/ "ImageMagick"
[GM]: http://www.graphicsmagick.org/ "GraphicsMagick"
[API]: http://neatonk.github.com/im4clj "API Docs"
[wiki]: http://github.com/neatonk/im4clj/wiki "im4clj wiki"

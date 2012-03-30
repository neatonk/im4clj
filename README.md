im4clj
======

ImageMagick/GraphicsMagick commandline wrapper for Clojure. Manipulate images with Clojure code.

Crop an image...

```clojure
user> (convert "path/to/image.jpg" (-crop 640 480 -1 50) "path/to/new-image.jpg")
```
Get documentation...

```clojure
user> (doc -crop)
-------------------------
im4clj.core/-crop
([width height] [width height x y] [width height x y special])
  preferred size and location of the cropped image
nil
```

Install
-------

Add the following dependency to your `project.clj` file:

    [im4clj "0.0.1-SNAPSHOT"]

Documentation
-------------

* [API Docs](http://neatonk.github.com/im4clj)


License
-------

Copyright (C) deeperbydesign, inc 2012.

Distributed under the Eclipse Public License, the same as Clojure.

Test images obtained from NASA's website are public domain and not subject to the above copyright notice.

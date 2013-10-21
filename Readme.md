# uima-igo

UIMA wrapper for Japanese morphological analyzer [Igo](http://igo.sourceforge.jp/).

## Configuration Parameters

### DicDir (String)

Path to the dictionary.

## Before Using

Prepare a compiled dictionary for Igo (see [Igo](http://igo.sourceforge.jp/) for how to compile).

## Build uima-igo

First download Igo and run script below to add it to your local repository (if necessary, modify the version to fit to your own Igo version).

```
mvn install:install-file -Dfile=igo-0.4.5.jar -DgroupId=net.reduls -DartifactId=igo -Dversion=0.4.5 -Dpackaging=jar
```

Then edit `pom.xml` to adapt the version of Igo.

Last `mvn package`.

## License

The MIT License (MIT)

Copyright (c) 2013 Ryo Murayama &lt;utatanenohibi@gmail.com&gt;

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.

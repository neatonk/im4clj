im4clj TODO's:
==============

Doc's and Testing
-----------------

README.md
- Add Getting Started
- Add Examples?

im4clj.command
- move all "gm" bits to im4clj.config?

im4clj.commands

im4clj.config
- merge into im4clj.command OR im4clj.run?

im4clj.core
- improve ns docstring.
- add examples to ns docstring?
- Add comprehensive tests for each option required.
  Use test.generative?

im4clj.defoptions
- add argspec tests?

im4clj.im4java
- improve error messages.
- return shell out.

im4clj.options
- add regression tests for option argspecs.
- ensure argspecs are correct and complete.

im4clj.run
- make stingify return a seq of strings even when given a string?

Future
------

im4clj.command
- consider using clojure.template/apply-template in defcommands...
- extract code used to prepare examples and docstrings for use in defoptions?
- use command :project and :version meta-keys to adjust options when necessary.

im4clj.commands
- add :examples for all of the defined commands.
- use :examples for testing OR check examples for correctness when testing.

im4clj.defoptions
- consider using clojure.template/apply-template in defoptions...
- use :examples code from im4clj.command.
- implement :pre and :post conditions for argument checking?
- implement multi-word argspecs.
- add type hints to argspecs to aid in testing?

im4clj.im4java
- implement piped commands.
- implement async commands.
- implement BufferedImage IO.
- return shell output. required for 'identify.

im4clj.run
- Extend map to act like an unordered collection of options and args when stringified?
- Make command runner configurable, so that im4java can be replaced by 'pallet.shell,
  clojure.java.shell, etc.
- Automagically identify and expand glob strings?

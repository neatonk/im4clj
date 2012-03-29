{:namespaces
 ({:source-url
   "http://github.com/neatonk/im4clj/blob/e25d116153eea84d435991594c6ce2ecbbff5312/src/im4clj/command.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj/im4clj.command-api.html",
   :name "im4clj.command",
   :author "Kevin Neaton",
   :doc "Command infrastructure."}
  {:source-url
   "http://github.com/neatonk/im4clj/blob/e25d116153eea84d435991594c6ce2ecbbff5312/src/im4clj/commands.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj/im4clj.commands-api.html",
   :name "im4clj.commands",
   :author "Kevin Neaton",
   :doc "Command fn's"}
  {:source-url
   "http://github.com/neatonk/im4clj/blob/403c5356f49e74924f54cf684e033704689711ec/src/im4clj/config.clj",
   :wiki-url "http://neatonk.github.com/im4clj/im4clj.config-api.html",
   :name "im4clj.config",
   :author "Kevin Neaton",
   :doc "Configure im4clj"}
  {:source-url
   "http://github.com/neatonk/im4clj/blob/de86f2ed1d2067ef5a93874ec4aa22ad07a8e904/src/im4clj/core.clj",
   :wiki-url "http://neatonk.github.com/im4clj/im4clj.core-api.html",
   :name "im4clj.core",
   :author "Kevin Neaton",
   :doc "ImageMagick for Clojure."}
  {:source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/defoptions.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj/im4clj.defoptions-api.html",
   :name "im4clj.defoptions",
   :author "Kevin Neaton",
   :doc
   "Macros used internally to define the option-fn's used by im4clj."}
  {:source-url
   "http://github.com/neatonk/im4clj/blob/7ced1be7159b6ede72a17887aaeb2aee150ea215/src/im4clj/im4java.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj/im4clj.im4java-api.html",
   :name "im4clj.im4java",
   :author "Kevin Neaton",
   :doc
   "Wrapper functions and utils for running shell commands with im4java."}
  {:source-url
   "http://github.com/neatonk/im4clj/blob/f013fbcb4e8cfdda881cfa7f57ddcf097b7326f4/src/im4clj/magick.clj",
   :wiki-url "http://neatonk.github.com/im4clj/im4clj.magick-api.html",
   :name "im4clj.magick",
   :author "Kevin Neaton",
   :doc
   "ImageMagick for Clojure. im4clj.magick defines a single public... magick. Use magick to access all of im4clj's goodness without polluting our current namespace."}
  {:source-url
   "http://github.com/neatonk/im4clj/blob/77b541fdee0af63dc797880f8409165d769cc806/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj/im4clj.options-api.html",
   :name "im4clj.options",
   :author "Kevin Neaton",
   :doc "Options fn's"}
  {:source-url
   "http://github.com/neatonk/im4clj/blob/8bd59ccb3968f268e6ba18714770bd59d23c3e0b/src/im4clj/run.clj",
   :wiki-url "http://neatonk.github.com/im4clj/im4clj.run-api.html",
   :name "im4clj.run",
   :author "Kevin Neaton",
   :doc "Stringify and run commands via im4java."}
  {:source-url
   "http://github.com/neatonk/im4clj/blob/403c5356f49e74924f54cf684e033704689711ec/src/im4clj/util/log.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj/im4clj.util.log-api.html",
   :name "im4clj.util.log",
   :author "Kevin Neaton",
   :doc "Basic logging util's"}
  {:source-url
   "http://github.com/neatonk/im4clj/blob/f91f9b6d4f7b38227cd1d71b9a85ff96a2e784b4/src/im4clj/util/ns.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj/im4clj.util.ns-api.html",
   :name "im4clj.util.ns",
   :doc "Namespace utilities"}
  {:source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj/im4clj.options.gm-convert-api.html",
   :name "im4clj.options.gm-convert",
   :doc nil}),
 :vars
 ({:arglists ([cmd]),
   :name "command",
   :namespace "im4clj.command",
   :source-url
   "http://github.com/neatonk/im4clj/blob/e25d116153eea84d435991594c6ce2ecbbff5312/src/im4clj/command.clj#L24",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/e25d116153eea84d435991594c6ce2ecbbff5312/src/im4clj/command.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.command-api.html#im4clj.command/command",
   :doc
   "Build a new command. Prepends \"gm\" to the command if (use-gm?) is true.\n\n Example Usage:\n\n (command :convert)\n (command 'convert)\n (command \"convert\")\n",
   :var-type "function",
   :line 24,
   :file "src/im4clj/command.clj"}
  {:arglists ([cmd attr-map]),
   :name "defcommand",
   :namespace "im4clj.command",
   :source-url
   "http://github.com/neatonk/im4clj/blob/e25d116153eea84d435991594c6ce2ecbbff5312/src/im4clj/command.clj#L40",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/e25d116153eea84d435991594c6ce2ecbbff5312/src/im4clj/command.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.command-api.html#im4clj.command/defcommand",
   :doc
   "Define a new command-fn. Takes a symbol and an attr-map.\n\nTODO: add example usage.",
   :var-type "macro",
   :line 40,
   :file "src/im4clj/command.clj"}
  {:arglists ([attr-map & specs]),
   :name "defcommands",
   :namespace "im4clj.command",
   :source-url
   "http://github.com/neatonk/im4clj/blob/e25d116153eea84d435991594c6ce2ecbbff5312/src/im4clj/command.clj#L56",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/e25d116153eea84d435991594c6ce2ecbbff5312/src/im4clj/command.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.command-api.html#im4clj.command/defcommands",
   :doc "Define a bunch of command-fn's with the given attributes.",
   :var-type "macro",
   :line 56,
   :file "src/im4clj/command.clj"}
  {:arglists ([& options]),
   :name "animate",
   :namespace "im4clj.commands",
   :source-url
   "http://github.com/neatonk/im4clj/blob/e25d116153eea84d435991594c6ce2ecbbff5312/src/im4clj/commands.clj#L15",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/e25d116153eea84d435991594c6ce2ecbbff5312/src/im4clj/commands.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.commands-api.html#im4clj.commands/animate",
   :doc
   "Run a animate command with the given options. See IM/GM documentation for usage.\n\nTODO: add example usage.",
   :var-type "function",
   :line 15,
   :file "src/im4clj/commands.clj"}
  {:arglists ([& options]),
   :name "compare",
   :namespace "im4clj.commands",
   :source-url
   "http://github.com/neatonk/im4clj/blob/e25d116153eea84d435991594c6ce2ecbbff5312/src/im4clj/commands.clj#L15",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/e25d116153eea84d435991594c6ce2ecbbff5312/src/im4clj/commands.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.commands-api.html#im4clj.commands/compare",
   :doc
   "Run a compare command with the given options. See IM/GM documentation for usage.\n\nTODO: add example usage.",
   :var-type "function",
   :line 15,
   :file "src/im4clj/commands.clj"}
  {:arglists ([& options]),
   :name "composite",
   :namespace "im4clj.commands",
   :source-url
   "http://github.com/neatonk/im4clj/blob/e25d116153eea84d435991594c6ce2ecbbff5312/src/im4clj/commands.clj#L15",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/e25d116153eea84d435991594c6ce2ecbbff5312/src/im4clj/commands.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.commands-api.html#im4clj.commands/composite",
   :doc
   "Run a composite command with the given options. See IM/GM documentation for usage.\n\nTODO: add example usage.",
   :var-type "function",
   :line 15,
   :file "src/im4clj/commands.clj"}
  {:arglists ([& options]),
   :name "conjure",
   :namespace "im4clj.commands",
   :source-url
   "http://github.com/neatonk/im4clj/blob/e25d116153eea84d435991594c6ce2ecbbff5312/src/im4clj/commands.clj#L15",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/e25d116153eea84d435991594c6ce2ecbbff5312/src/im4clj/commands.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.commands-api.html#im4clj.commands/conjure",
   :doc
   "Run a conjure command with the given options. See IM/GM documentation for usage.\n\nTODO: add example usage.",
   :var-type "function",
   :line 15,
   :file "src/im4clj/commands.clj"}
  {:arglists ([& options]),
   :name "convert",
   :namespace "im4clj.commands",
   :source-url
   "http://github.com/neatonk/im4clj/blob/e25d116153eea84d435991594c6ce2ecbbff5312/src/im4clj/commands.clj#L15",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/e25d116153eea84d435991594c6ce2ecbbff5312/src/im4clj/commands.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.commands-api.html#im4clj.commands/convert",
   :doc
   "Run a convert command with the given options. See IM/GM documentation for usage.\n\nExample Usage:\n\n(convert \"input.jpg\" (resize 640 480) \"output.jpg\")",
   :var-type "function",
   :line 15,
   :file "src/im4clj/commands.clj"}
  {:arglists ([& options]),
   :name "display",
   :namespace "im4clj.commands",
   :source-url
   "http://github.com/neatonk/im4clj/blob/e25d116153eea84d435991594c6ce2ecbbff5312/src/im4clj/commands.clj#L15",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/e25d116153eea84d435991594c6ce2ecbbff5312/src/im4clj/commands.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.commands-api.html#im4clj.commands/display",
   :doc
   "Run a display command with the given options. See IM/GM documentation for usage.\n\nTODO: add example usage.",
   :var-type "function",
   :line 15,
   :file "src/im4clj/commands.clj"}
  {:arglists ([& options]),
   :name "identify",
   :namespace "im4clj.commands",
   :source-url
   "http://github.com/neatonk/im4clj/blob/e25d116153eea84d435991594c6ce2ecbbff5312/src/im4clj/commands.clj#L15",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/e25d116153eea84d435991594c6ce2ecbbff5312/src/im4clj/commands.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.commands-api.html#im4clj.commands/identify",
   :doc
   "Run a identify command with the given options. See IM/GM documentation for usage.\n\nTODO: add example usage.",
   :var-type "function",
   :line 15,
   :file "src/im4clj/commands.clj"}
  {:arglists ([& options]),
   :name "import",
   :namespace "im4clj.commands",
   :source-url
   "http://github.com/neatonk/im4clj/blob/e25d116153eea84d435991594c6ce2ecbbff5312/src/im4clj/commands.clj#L15",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/e25d116153eea84d435991594c6ce2ecbbff5312/src/im4clj/commands.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.commands-api.html#im4clj.commands/import",
   :doc
   "Run a import command with the given options. See IM/GM documentation for usage.\n\nTODO: add example usage.",
   :var-type "function",
   :line 15,
   :file "src/im4clj/commands.clj"}
  {:arglists ([& options]),
   :name "mogrify",
   :namespace "im4clj.commands",
   :source-url
   "http://github.com/neatonk/im4clj/blob/e25d116153eea84d435991594c6ce2ecbbff5312/src/im4clj/commands.clj#L15",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/e25d116153eea84d435991594c6ce2ecbbff5312/src/im4clj/commands.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.commands-api.html#im4clj.commands/mogrify",
   :doc
   "Run a mogrify command with the given options. See IM/GM documentation for usage.\n\nTODO: add example usage.",
   :var-type "function",
   :line 15,
   :file "src/im4clj/commands.clj"}
  {:arglists ([& options]),
   :name "montage",
   :namespace "im4clj.commands",
   :source-url
   "http://github.com/neatonk/im4clj/blob/e25d116153eea84d435991594c6ce2ecbbff5312/src/im4clj/commands.clj#L15",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/e25d116153eea84d435991594c6ce2ecbbff5312/src/im4clj/commands.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.commands-api.html#im4clj.commands/montage",
   :doc
   "Run a montage command with the given options. See IM/GM documentation for usage.\n\nTODO: add example usage.",
   :var-type "function",
   :line 15,
   :file "src/im4clj/commands.clj"}
  {:arglists ([& options]),
   :name "stream",
   :namespace "im4clj.commands",
   :source-url
   "http://github.com/neatonk/im4clj/blob/e25d116153eea84d435991594c6ce2ecbbff5312/src/im4clj/commands.clj#L15",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/e25d116153eea84d435991594c6ce2ecbbff5312/src/im4clj/commands.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.commands-api.html#im4clj.commands/stream",
   :doc
   "Run a stream command with the given options. See IM/GM documentation for usage.\n\nTODO: add example usage.\n\nImageMagick only.",
   :var-type "function",
   :line 15,
   :file "src/im4clj/commands.clj"}
  {:arglists ([]),
   :name "use-gm",
   :namespace "im4clj.config",
   :source-url
   "http://github.com/neatonk/im4clj/blob/403c5356f49e74924f54cf684e033704689711ec/src/im4clj/config.clj#L15",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/403c5356f49e74924f54cf684e033704689711ec/src/im4clj/config.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.config-api.html#im4clj.config/use-gm",
   :doc "Get the thread-local value of *use-gm*.",
   :var-type "function",
   :line 15,
   :file "src/im4clj/config.clj"}
  {:arglists ([] [bool]),
   :name "use-gm!",
   :namespace "im4clj.config",
   :source-url
   "http://github.com/neatonk/im4clj/blob/403c5356f49e74924f54cf684e033704689711ec/src/im4clj/config.clj#L19",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/403c5356f49e74924f54cf684e033704689711ec/src/im4clj/config.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.config-api.html#im4clj.config/use-gm!",
   :doc "Set the thread-local value of *use-gm*.",
   :var-type "function",
   :line 19,
   :file "src/im4clj/config.clj"}
  {:arglists ([]),
   :name "use-gm?",
   :namespace "im4clj.config",
   :source-url
   "http://github.com/neatonk/im4clj/blob/403c5356f49e74924f54cf684e033704689711ec/src/im4clj/config.clj#L24",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/403c5356f49e74924f54cf684e033704689711ec/src/im4clj/config.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.config-api.html#im4clj.config/use-gm?",
   :doc
   "Predicate. Returns true if *use-gm* is bound to true. Use with-gm and with-im\nfor binding.",
   :var-type "function",
   :line 24,
   :file "src/im4clj/config.clj"}
  {:arglists ([& body]),
   :name "with-gm",
   :namespace "im4clj.config",
   :source-url
   "http://github.com/neatonk/im4clj/blob/403c5356f49e74924f54cf684e033704689711ec/src/im4clj/config.clj#L29",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/403c5356f49e74924f54cf684e033704689711ec/src/im4clj/config.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.config-api.html#im4clj.config/with-gm",
   :doc "Evaluates 'body' with *use-gm* bound to true.",
   :var-type "macro",
   :line 29,
   :file "src/im4clj/config.clj"}
  {:arglists ([& body]),
   :name "with-im",
   :namespace "im4clj.config",
   :source-url
   "http://github.com/neatonk/im4clj/blob/403c5356f49e74924f54cf684e033704689711ec/src/im4clj/config.clj#L35",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/403c5356f49e74924f54cf684e033704689711ec/src/im4clj/config.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.config-api.html#im4clj.config/with-im",
   :doc "Evaluates 'body' with *use-gm* bound to false.",
   :var-type "macro",
   :line 35,
   :file "src/im4clj/config.clj"}
  {:arglists ([this]),
   :name "-adjoin",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-adjoin",
   :doc "join images into a single multi-image file",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this matrix]),
   :name "-affine",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-affine",
   :doc "drawing transform matrix",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this]),
   :name "-antialias",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-antialias",
   :doc "remove pixel aliasing",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this]),
   :name "-append",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-append",
   :doc "append a set of images",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this spec]),
   :name "-asc-cdl",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-asc-cdl",
   :doc "apply ASC CDL color transform",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this string]),
   :name "-authenticate",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-authenticate",
   :doc "decrypt image with this password",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this]),
   :name "-average",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-average",
   :doc "average a set of images",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this color]),
   :name "-background",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-background",
   :doc "the background color",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists
   ([this red]
    [this red green]
    [this red green blue]
    [this red green blue opacity]),
   :name "-black-threshold",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-black-threshold",
   :doc "pixels below the threshold become black",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this x y]),
   :name "-blue-primary",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-blue-primary",
   :doc "blue chromaticity primary point",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this radius] [this radius sigma]),
   :name "-blur",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-blur",
   :doc "blur the image with a Gaussian operator",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this width height]),
   :name "-border",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-border",
   :doc "surround the image with a border of color",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this color]),
   :name "-bordercolor",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-bordercolor",
   :doc "the border color",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this color]),
   :name "-box",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-box",
   :doc "set the color of the annotation bounding box",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this type]),
   :name "-channel",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-channel",
   :doc "the type of channel",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this factor]),
   :name "-charcoal",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-charcoal",
   :doc "simulate a charcoal drawing",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists
   ([this width height]
    [this width height x y]
    [this width height x y special]),
   :name "-chop",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-chop",
   :doc "remove pixels from the interior of an image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this]),
   :name "-clip",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-clip",
   :doc "apply the clipping path, if one is present",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this]),
   :name "-coalesce",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-coalesce",
   :doc "merge a sequence of images",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this value]),
   :name "-colorize",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-colorize",
   :doc "colorize the image with the pen color",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this value]),
   :name "-colors",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-colors",
   :doc "preferred number of colors in the image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this value]),
   :name "-colorspace",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-colorspace",
   :doc "the type of colorspace",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this string]),
   :name "-comment",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-comment",
   :doc "annotate an image with a comment",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this operator]),
   :name "-compose",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-compose",
   :doc "the type of image composition",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this type]),
   :name "-compress",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-compress",
   :doc "the type of image compression",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this]),
   :name "-contrast",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-contrast",
   :doc "enhance or reduce the image contrast",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this kernel]),
   :name "-convolve",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-convolve",
   :doc "convolve image with the specified convolution kernel",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists
   ([this width height]
    [this width height x y]
    [this width height x y special]),
   :name "-crop",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-crop",
   :doc "preferred size and location of the cropped image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this amount]),
   :name "-cycle",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-cycle",
   :doc "displace image colormap by amount",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this events]),
   :name "-debug",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-debug",
   :doc "enable debug printout",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this]),
   :name "-deconstruct",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-deconstruct",
   :doc "break down an image sequence into constituent parts",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this key] [this key value]),
   :name "-define",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-define",
   :doc "add coder/decoder specific options",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this hundredths-of-a-second]),
   :name "-delay",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-delay",
   :doc "display the next image after pausing",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this width height]),
   :name "-density",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-density",
   :doc "horizontal and vertical resolution in pixels of the image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this value]),
   :name "-depth",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-depth",
   :doc "depth of the image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this]),
   :name "-despeckle",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-despeckle",
   :doc "reduce the speckles within an image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this host display] [this host display screen]),
   :name "-display",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-display",
   :doc "specifies the X server to contact",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this method]),
   :name "-dispose",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-dispose",
   :doc "GIF disposal method",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this]),
   :name "-dither",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-dither",
   :doc "apply Floyd/Steinberg error diffusion to the image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this string]),
   :name "-draw",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-draw",
   :doc "annotate an image with one or more graphic primitives",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this radius]),
   :name "-edge",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-edge",
   :doc "detect edges within an image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this radius]),
   :name "-emboss",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-emboss",
   :doc "emboss an image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this type]),
   :name "-encoding",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-encoding",
   :doc "specify the text encoding",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this type]),
   :name "-endian",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-endian",
   :doc "specify endianness (MSB, LSB, or Native) of image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this]),
   :name "-enhance",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-enhance",
   :doc "apply a digital filter to enhance a noisy image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this]),
   :name "-equalize",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-equalize",
   :doc "perform histogram equalization to the image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this width height] [this width height x y]),
   :name "-extent",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-extent",
   :doc "composite image on background color canvas image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this color]),
   :name "-fill",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-fill",
   :doc "color to use when filling a graphic primitive",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this type]),
   :name "-filter",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-filter",
   :doc "use this type of filter when resizing an image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this]),
   :name "-flatten",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-flatten",
   :doc "flatten a sequence of images",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this]),
   :name "-flip",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-flip",
   :doc "create a \"mirror image\"",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this]),
   :name "-flop",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-flop",
   :doc "create a \"mirror image\"",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this name]),
   :name "-font",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-font",
   :doc "use this font when annotating the image with text",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this width height outer-bevel-width inner-bevel-width]),
   :name "-frame",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-frame",
   :doc "surround the image with an ornamental border",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this distance] [this distance percent?]),
   :name "-fuzz",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-fuzz",
   :doc "colors within this Euclidean distance are considered equal",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this value]),
   :name "-gamma",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-gamma",
   :doc "level of gamma correction",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this radius] [this radius sigma]),
   :name "-gaussian",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-gaussian",
   :doc "blur the image with a Gaussian operator",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists
   ([this width height]
    [this width height x y]
    [this width height x y special]),
   :name "-geometry",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-geometry",
   :doc "preferred size and location of the Image window.",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this type]),
   :name "-gravity",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-gravity",
   :doc
   "direction primitive  gravitates to when annotating the image.",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this x y]),
   :name "-green-primary",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-green-primary",
   :doc "green chromaticity primary point",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this clut]),
   :name "-hald-clut",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-hald-clut",
   :doc "apply a Hald CLUT to the image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this]),
   :name "-help",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-help",
   :doc "print usage instructions",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this factor]),
   :name "-implode",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-implode",
   :doc "implode image pixels about the center",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this type]),
   :name "-intent",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-intent",
   :doc
   "use this type of rendering intent when managing the image color",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this type]),
   :name "-interlace",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-interlace",
   :doc "the type of interlacing scheme",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this name]),
   :name "-label",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-label",
   :doc "assign a label to an image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists
   ([this width height offset] [this width height offset percent?]),
   :name "-lat",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-lat",
   :doc "perform local adaptive thresholding",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists
   ([this black-point]
    [this black-point gamma]
    [this black-point gamma white-point]
    [this black-point gamma white-point percent?]),
   :name "-level",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-level",
   :doc "adjust the level of image contrast",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this type value]),
   :name "-limit",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L456",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-limit",
   :doc "Disk, File, Map, Memory, Pixels, or Threads resource limit",
   :var-type "function",
   :line 456,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this type]),
   :name "-list",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-list",
   :doc "the type of list",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this string]),
   :name "-log",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-log",
   :doc "Specify format for debug log",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this iterations]),
   :name "-loop",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-loop",
   :doc "add Netscape loop extension to your GIF animation",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this]),
   :name "-magnify",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-magnify",
   :doc "magnify the image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this filename]),
   :name "-map",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-map",
   :doc "choose a particular set of colors from this image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this filename]),
   :name "-mask",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-mask",
   :doc "Specify a clipping mask",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this]),
   :name "-matte",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-matte",
   :doc "store matte channel if the image has one",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this color]),
   :name "-mattecolor",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-mattecolor",
   :doc "specify the color to be used with the -frame option",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this radius]),
   :name "-median",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-median",
   :doc "apply a median filter to the image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this factor]),
   :name "-minify",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-minify",
   :doc "minify the image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists
   ([this brightness]
    [this brightness saturation]
    [this brightness saturation hue]),
   :name "-modulate",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-modulate",
   :doc "vary the brightness, saturation, and hue of an image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this]),
   :name "-monitor",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-monitor",
   :doc "show progress indication",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this]),
   :name "-monochrome",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-monochrome",
   :doc "transform the image to black and white",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this frames]),
   :name "-morph",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-morph",
   :doc "morphs an image sequence",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this]),
   :name "-mosaic",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-mosaic",
   :doc "create a mosaic from an image or an image sequence",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists
   ([this radius] [this radius sigma] [this radius sigma angle]),
   :name "-motion-blur",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-motion-blur",
   :doc "Simulate motion blur",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this]),
   :name "-negate",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-negate",
   :doc "replace every pixel with its complementary color",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this radius-or-type]),
   :name "-noise",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-noise",
   :doc "add or reduce noise in an image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this]),
   :name "-noop",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-noop",
   :doc "NOOP (no option)",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this]),
   :name "-normalize",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-normalize",
   :doc "transform image to span the full range of color values",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this color]),
   :name "-opaque",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-opaque",
   :doc "change this color to the pen color within the image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists
   ([this channel operator rvalue]
    [this channel operator rvalue percent?]),
   :name "-operator",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-operator",
   :doc
   "apply a mathematical, bitwise, or value operator to an image channel",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this channeltype n-by-n]),
   :name "-ordered-dither",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-ordered-dither",
   :doc "ordered dither the image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists
   ([this width height]
    [this width height x y]
    [this width height x y special]),
   :name "-page",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-page",
   :doc "size and location of an image canvas",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this radius]),
   :name "-paint",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-paint",
   :doc "simulate an oil painting",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this color]),
   :name "-pen",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-pen",
   :doc "(This option has been replaced by the -fill option)",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this]),
   :name "-ping",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-ping",
   :doc "efficiently determine image characteristics",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this value]),
   :name "-pointsize",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-pointsize",
   :doc "pointsize of the PostScript, X11, or TrueType font",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this type]),
   :name "-preview",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-preview",
   :doc "image preview type",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this command]),
   :name "-process",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-process",
   :doc "process a sequence of images using a process module",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this filename]),
   :name "-profile",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-profile",
   :doc "add ICM, IPTC, or generic profile  to image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this value]),
   :name "-quality",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-quality",
   :doc "JPEG/MIFF/PNG/TIFF compression level",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this width height]),
   :name "-raise",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-raise",
   :doc "lighten or darken image edges",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this channeltype low-x-high]),
   :name "-random-threshold",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-random-threshold",
   :doc "random threshold the image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this matrix]),
   :name "-recolor",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-recolor",
   :doc "apply a color translation matrix to image channels",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this x y]),
   :name "-red-primary",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-red-primary",
   :doc "red chromaticity primary point",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this width height] [this width height x y]),
   :name "-region",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-region",
   :doc "apply options to a portion of the image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this]),
   :name "-render",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-render",
   :doc "render vector operations",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this horizontal vertical]),
   :name "-resample",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-resample",
   :doc
   "Resample image to specified horizontal and vertical resolution",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this width height] [this width height special]),
   :name "-resize",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-resize",
   :doc "resize an image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this x y]),
   :name "-roll",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-roll",
   :doc "roll an image vertically or horizontally",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this degrees] [this degrees special]),
   :name "-rotate",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-rotate",
   :doc "rotate the image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this geometry]),
   :name "-sample",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-sample",
   :doc "scale image using pixel sampling",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this horizontal-factor vertical-factor]),
   :name "-sampling-factor",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-sampling-factor",
   :doc "chroma subsampling factors",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this geometry]),
   :name "-scale",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-scale",
   :doc "scale the image.",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this value]),
   :name "-scene",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-scene",
   :doc "set scene number",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this cluster-threshold smoothing-threshold]),
   :name "-segment",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-segment",
   :doc "segment an image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this attribute] [this attribute value]),
   :name "-set",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L461",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-set",
   :doc "set an image attribute",
   :var-type "function",
   :line 461,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this azimuth elevation]),
   :name "-shade",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-shade",
   :doc "shade the image using a distant light source",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this radius] [this radius sigma]),
   :name "-sharpen",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-sharpen",
   :doc "sharpen the image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this width height] [this width height percent?]),
   :name "-shave",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-shave",
   :doc "shave pixels from the image edges",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this x-degrees y-degrees]),
   :name "-shear",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-shear",
   :doc "shear the image along the X or Y axis",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this width height] [this width height offset]),
   :name "-size",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-size",
   :doc "width and height of the image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this factor]),
   :name "-solarize",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-solarize",
   :doc "negate all pixels above the threshold level",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this amount]),
   :name "-spread",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-spread",
   :doc "displace image pixels by a random amount",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this color]),
   :name "-stroke",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-stroke",
   :doc "color to use when stroking a graphic primitive",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this value]),
   :name "-strokewidth",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-strokewidth",
   :doc "set the stroke width",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this degrees]),
   :name "-swirl",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-swirl",
   :doc "swirl image pixels about the center",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this filename]),
   :name "-texture",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-texture",
   :doc "name of texture to tile onto the image background",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this value] [this value percent?]),
   :name "-threshold",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-threshold",
   :doc "threshold the image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this width height] [this width height special]),
   :name "-thumbnail",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-thumbnail",
   :doc "resize an image (quickly)",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this filename]),
   :name "-tile",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-tile",
   :doc "tile image when filling a graphic primitive",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this]),
   :name "-transform",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-transform",
   :doc "transform the image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this color]),
   :name "-transparent",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-transparent",
   :doc "make this color transparent within the image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this value]),
   :name "-treedepth",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-treedepth",
   :doc "tree depth for the color reduction algorithm",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this]),
   :name "-trim",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-trim",
   :doc "trim an image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this type]),
   :name "-type",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-type",
   :doc "the image type",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this type]),
   :name "-units",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-units",
   :doc "the units of image resolution",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists
   ([this radius]
    [this radius sigma]
    [this radius sigma amount]
    [this radius sigma amount threshold]),
   :name "-unsharp",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-unsharp",
   :doc "sharpen the image with an unsharp mask operator",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this]),
   :name "-use-pixmap",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-use-pixmap",
   :doc "use the pixmap",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this]),
   :name "-verbose",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-verbose",
   :doc "print detailed information about the image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this]),
   :name "-version",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-version",
   :doc "print GraphicsMagick version string",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this string]),
   :name "-view",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-view",
   :doc "FlashPix viewing parameters",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this method]),
   :name "-virtual-pixel",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-virtual-pixel",
   :doc "specify contents of \"virtual pixels\"",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this amplitude wavelength]),
   :name "-wave",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-wave",
   :doc "alter an image along a sine wave",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this x y]),
   :name "-white-point",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-white-point",
   :doc "chromaticity white point",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists
   ([this red]
    [this red green]
    [this red green blue]
    [this red green blue opacity]),
   :name "-white-threshold",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-white-threshold",
   :doc "pixels above the threshold become white",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this filename]),
   :name "-write",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-write",
   :doc "write an intermediate image [convert, composite]",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([& options]),
   :name "animate",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/e25d116153eea84d435991594c6ce2ecbbff5312/src/im4clj/commands.clj#L15",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/e25d116153eea84d435991594c6ce2ecbbff5312/src/im4clj/commands.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/animate",
   :doc
   "Run a animate command with the given options. See IM/GM documentation for usage.\n\nTODO: add example usage.",
   :var-type "function",
   :line 15,
   :file "src/im4clj/commands.clj"}
  {:arglists ([& options]),
   :name "compare",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/e25d116153eea84d435991594c6ce2ecbbff5312/src/im4clj/commands.clj#L15",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/e25d116153eea84d435991594c6ce2ecbbff5312/src/im4clj/commands.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/compare",
   :doc
   "Run a compare command with the given options. See IM/GM documentation for usage.\n\nTODO: add example usage.",
   :var-type "function",
   :line 15,
   :file "src/im4clj/commands.clj"}
  {:arglists ([& options]),
   :name "composite",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/e25d116153eea84d435991594c6ce2ecbbff5312/src/im4clj/commands.clj#L15",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/e25d116153eea84d435991594c6ce2ecbbff5312/src/im4clj/commands.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/composite",
   :doc
   "Run a composite command with the given options. See IM/GM documentation for usage.\n\nTODO: add example usage.",
   :var-type "function",
   :line 15,
   :file "src/im4clj/commands.clj"}
  {:arglists ([& options]),
   :name "conjure",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/e25d116153eea84d435991594c6ce2ecbbff5312/src/im4clj/commands.clj#L15",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/e25d116153eea84d435991594c6ce2ecbbff5312/src/im4clj/commands.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/conjure",
   :doc
   "Run a conjure command with the given options. See IM/GM documentation for usage.\n\nTODO: add example usage.",
   :var-type "function",
   :line 15,
   :file "src/im4clj/commands.clj"}
  {:arglists ([& options]),
   :name "convert",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/e25d116153eea84d435991594c6ce2ecbbff5312/src/im4clj/commands.clj#L15",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/e25d116153eea84d435991594c6ce2ecbbff5312/src/im4clj/commands.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/convert",
   :doc
   "Run a convert command with the given options. See IM/GM documentation for usage.\n\nExample Usage:\n\n(convert \"input.jpg\" (resize 640 480) \"output.jpg\")",
   :var-type "function",
   :line 15,
   :file "src/im4clj/commands.clj"}
  {:arglists ([& options]),
   :name "display",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/e25d116153eea84d435991594c6ce2ecbbff5312/src/im4clj/commands.clj#L15",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/e25d116153eea84d435991594c6ce2ecbbff5312/src/im4clj/commands.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/display",
   :doc
   "Run a display command with the given options. See IM/GM documentation for usage.\n\nTODO: add example usage.",
   :var-type "function",
   :line 15,
   :file "src/im4clj/commands.clj"}
  {:arglists ([& options]),
   :name "identify",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/e25d116153eea84d435991594c6ce2ecbbff5312/src/im4clj/commands.clj#L15",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/e25d116153eea84d435991594c6ce2ecbbff5312/src/im4clj/commands.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/identify",
   :doc
   "Run a identify command with the given options. See IM/GM documentation for usage.\n\nTODO: add example usage.",
   :var-type "function",
   :line 15,
   :file "src/im4clj/commands.clj"}
  {:arglists ([& options]),
   :name "import",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/e25d116153eea84d435991594c6ce2ecbbff5312/src/im4clj/commands.clj#L15",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/e25d116153eea84d435991594c6ce2ecbbff5312/src/im4clj/commands.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/import",
   :doc
   "Run a import command with the given options. See IM/GM documentation for usage.\n\nTODO: add example usage.",
   :var-type "function",
   :line 15,
   :file "src/im4clj/commands.clj"}
  {:arglists ([& options]),
   :name "mogrify",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/e25d116153eea84d435991594c6ce2ecbbff5312/src/im4clj/commands.clj#L15",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/e25d116153eea84d435991594c6ce2ecbbff5312/src/im4clj/commands.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/mogrify",
   :doc
   "Run a mogrify command with the given options. See IM/GM documentation for usage.\n\nTODO: add example usage.",
   :var-type "function",
   :line 15,
   :file "src/im4clj/commands.clj"}
  {:arglists ([& options]),
   :name "montage",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/e25d116153eea84d435991594c6ce2ecbbff5312/src/im4clj/commands.clj#L15",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/e25d116153eea84d435991594c6ce2ecbbff5312/src/im4clj/commands.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/montage",
   :doc
   "Run a montage command with the given options. See IM/GM documentation for usage.\n\nTODO: add example usage.",
   :var-type "function",
   :line 15,
   :file "src/im4clj/commands.clj"}
  {:arglists ([cmd & opts]),
   :name "run",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/8bd59ccb3968f268e6ba18714770bd59d23c3e0b/src/im4clj/run.clj#L45",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/8bd59ccb3968f268e6ba18714770bd59d23c3e0b/src/im4clj/run.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/run",
   :doc
   "Run a command by name with the given opts. Accepts any Stringifiable\n type.\n\n Prefer pre-defined commands e.g. im4clj.core/convert.\n\n Example Usage:\n\n (run :convert \"input.jpg\" '-resize 100 \"output.jpg\")\n (run [:gm :convert] \"input.jpg\" '-resize 100 \"output.jpg\")\n",
   :var-type "function",
   :line 45,
   :file "src/im4clj/run.clj"}
  {:arglists ([& options]),
   :name "stream",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/e25d116153eea84d435991594c6ce2ecbbff5312/src/im4clj/commands.clj#L15",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/e25d116153eea84d435991594c6ce2ecbbff5312/src/im4clj/commands.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/stream",
   :doc
   "Run a stream command with the given options. See IM/GM documentation for usage.\n\nTODO: add example usage.\n\nImageMagick only.",
   :var-type "function",
   :line 15,
   :file "src/im4clj/commands.clj"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/stringify",
   :namespace "im4clj.core",
   :var-type "function",
   :arglists ([this]),
   :doc "Returns a string or a sequence of strings representing this.",
   :name "stringify"}
  {:arglists ([& args]),
   :name "stringify-all",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/8bd59ccb3968f268e6ba18714770bd59d23c3e0b/src/im4clj/run.clj#L37",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/8bd59ccb3968f268e6ba18714770bd59d23c3e0b/src/im4clj/run.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/stringify-all",
   :doc "Convert args to a flat sequence of strings.",
   :var-type "function",
   :line 37,
   :file "src/im4clj/run.clj"}
  {:arglists ([]),
   :name "use-gm",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/403c5356f49e74924f54cf684e033704689711ec/src/im4clj/config.clj#L15",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/403c5356f49e74924f54cf684e033704689711ec/src/im4clj/config.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/use-gm",
   :doc "Get the thread-local value of *use-gm*.",
   :var-type "function",
   :line 15,
   :file "src/im4clj/config.clj"}
  {:arglists ([] [bool]),
   :name "use-gm!",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/403c5356f49e74924f54cf684e033704689711ec/src/im4clj/config.clj#L19",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/403c5356f49e74924f54cf684e033704689711ec/src/im4clj/config.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/use-gm!",
   :doc "Set the thread-local value of *use-gm*.",
   :var-type "function",
   :line 19,
   :file "src/im4clj/config.clj"}
  {:arglists ([]),
   :name "use-gm?",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/403c5356f49e74924f54cf684e033704689711ec/src/im4clj/config.clj#L24",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/403c5356f49e74924f54cf684e033704689711ec/src/im4clj/config.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/use-gm?",
   :doc
   "Predicate. Returns true if *use-gm* is bound to true. Use with-gm and with-im\nfor binding.",
   :var-type "function",
   :line 24,
   :file "src/im4clj/config.clj"}
  {:arglists ([& body]),
   :name "with-gm",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/403c5356f49e74924f54cf684e033704689711ec/src/im4clj/config.clj#L29",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/403c5356f49e74924f54cf684e033704689711ec/src/im4clj/config.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/with-gm",
   :doc "Evaluates 'body' with *use-gm* bound to true.",
   :var-type "macro",
   :line 29,
   :file "src/im4clj/config.clj"}
  {:arglists ([& body]),
   :name "with-im",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/403c5356f49e74924f54cf684e033704689711ec/src/im4clj/config.clj#L35",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/403c5356f49e74924f54cf684e033704689711ec/src/im4clj/config.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/with-im",
   :doc "Evaluates 'body' with *use-gm* bound to false.",
   :var-type "macro",
   :line 35,
   :file "src/im4clj/config.clj"}
  {:file "src/im4clj/defoptions.clj",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/defoptions.clj",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/defoptions.clj#L31",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.defoptions-api.html#im4clj.defoptions/AppendableSeq",
   :namespace "im4clj.defoptions",
   :line 31,
   :var-type "var",
   :doc "Protocol. Used to append zero or more items to 'this.",
   :name "AppendableSeq"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.defoptions-api.html#im4clj.defoptions/append",
   :namespace "im4clj.defoptions",
   :var-type "function",
   :arglists ([this more]),
   :doc
   "Returns a coll containing 'this or the items in 'this if it is a collection,\nfollowed by the items in 'more.",
   :name "append"}
  {:arglists ([opt argspec attr-map]),
   :name "defoption",
   :namespace "im4clj.defoptions",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/defoptions.clj#L78",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/defoptions.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.defoptions-api.html#im4clj.defoptions/defoption",
   :doc
   "Define a new option-fn. Takes a symbol, one or more argspecs, and an attr-map.\n\nargspec => [required-form [optional-form]+]\nrequired-form => constant-or-symbol+\noptional-form => constant-or-symbol+\n\ne.g. [width \"x\" height [\"+\" x \"+\" y] [special]]\n\nTODO:\n- implement pre and post conditions.\n- implement +options.",
   :var-type "macro",
   :line 78,
   :file "src/im4clj/defoptions.clj"}
  {:arglists ([attr-map & specs]),
   :name "defoptions",
   :namespace "im4clj.defoptions",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/defoptions.clj#L107",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/defoptions.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.defoptions-api.html#im4clj.defoptions/defoptions",
   :doc "Define a bunch of option-fn's with the given attributes.",
   :var-type "macro",
   :line 107,
   :file "src/im4clj/defoptions.clj"}
  {:arglists ([cmd & more]),
   :name "command",
   :namespace "im4clj.im4java",
   :source-url
   "http://github.com/neatonk/im4clj/blob/7ced1be7159b6ede72a17887aaeb2aee150ea215/src/im4clj/im4java.clj#L28",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/7ced1be7159b6ede72a17887aaeb2aee150ea215/src/im4clj/im4java.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.im4java-api.html#im4clj.im4java/command",
   :doc
   "Create and return a new im4java ImageCommand from the string(s) provided.",
   :var-type "function",
   :line 28,
   :file "src/im4clj/im4java.clj"}
  {:arglists ([& opt-strs]),
   :name "operation",
   :namespace "im4clj.im4java",
   :source-url
   "http://github.com/neatonk/im4clj/blob/7ced1be7159b6ede72a17887aaeb2aee150ea215/src/im4clj/im4java.clj#L35",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/7ced1be7159b6ede72a17887aaeb2aee150ea215/src/im4clj/im4java.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.im4java-api.html#im4clj.im4java/operation",
   :doc
   "Create and return a new im4java Operation from the string(s) provided.",
   :var-type "function",
   :line 35,
   :file "src/im4clj/im4java.clj"}
  {:arglists ([cmd & op]),
   :name "run",
   :namespace "im4clj.im4java",
   :source-url
   "http://github.com/neatonk/im4clj/blob/7ced1be7159b6ede72a17887aaeb2aee150ea215/src/im4clj/im4java.clj#L48",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/7ced1be7159b6ede72a17887aaeb2aee150ea215/src/im4clj/im4java.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.im4java-api.html#im4clj.im4java/run",
   :doc
   "Create and run an im4java ImageCommand from the string(s) provided.\n\nExample Usage:\n\n(run \"convert\" \"input.jpg\" \"resize\" \"100\" \"output.jpg\")",
   :var-type "function",
   :line 48,
   :file "src/im4clj/im4java.clj"}
  {:arglists ([]),
   :name "search-path",
   :namespace "im4clj.im4java",
   :source-url
   "http://github.com/neatonk/im4clj/blob/7ced1be7159b6ede72a17887aaeb2aee150ea215/src/im4clj/im4java.clj#L17",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/7ced1be7159b6ede72a17887aaeb2aee150ea215/src/im4clj/im4java.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.im4java-api.html#im4clj.im4java/search-path",
   :doc "Get the system search path used by im4java.",
   :var-type "function",
   :line 17,
   :file "src/im4clj/im4java.clj"}
  {:arglists ([path]),
   :name "search-path!",
   :namespace "im4clj.im4java",
   :source-url
   "http://github.com/neatonk/im4clj/blob/7ced1be7159b6ede72a17887aaeb2aee150ea215/src/im4clj/im4java.clj#L21",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/7ced1be7159b6ede72a17887aaeb2aee150ea215/src/im4clj/im4java.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.im4java-api.html#im4clj.im4java/search-path!",
   :doc "Set the system search path used by im4java.",
   :var-type "function",
   :line 21,
   :file "src/im4clj/im4java.clj"}
  {:arglists
   ([name doc-string? attr-map? [params*] body]
    [name doc-string? attr-map? ([params*] body) + attr-map?]),
   :name "defn-magick",
   :namespace "im4clj.magick",
   :source-url
   "http://github.com/neatonk/im4clj/blob/f013fbcb4e8cfdda881cfa7f57ddcf097b7326f4/src/im4clj/magick.clj#L40",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/f013fbcb4e8cfdda881cfa7f57ddcf097b7326f4/src/im4clj/magick.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.magick-api.html#im4clj.magick/defn-magick",
   :doc
   "Same as defn, but with all of the bindings of magick inside.\n\n Example Usage:\n\n (defn-magick [input-path output-path]\n   (convert input-path (resize 100) output-path))\n",
   :var-type "macro",
   :line 40,
   :file "src/im4clj/magick.clj"}
  {:arglists ([& body]),
   :name "magick",
   :namespace "im4clj.magick",
   :source-url
   "http://github.com/neatonk/im4clj/blob/f013fbcb4e8cfdda881cfa7f57ddcf097b7326f4/src/im4clj/magick.clj#L29",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/f013fbcb4e8cfdda881cfa7f57ddcf097b7326f4/src/im4clj/magick.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.magick-api.html#im4clj.magick/magick",
   :doc
   "Access all of im4clj's goodness without polluting the current namespace.\n\n Example Usage:\n\n (magick (convert input-path (resize 100) output-path))\n",
   :var-type "macro",
   :line 29,
   :file "src/im4clj/magick.clj"}
  {:arglists ([this]),
   :name "-adjoin",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-adjoin",
   :doc "join images into a single multi-image file",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this matrix]),
   :name "-affine",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-affine",
   :doc "drawing transform matrix",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this]),
   :name "-antialias",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-antialias",
   :doc "remove pixel aliasing",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this]),
   :name "-append",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-append",
   :doc "append a set of images",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this spec]),
   :name "-asc-cdl",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-asc-cdl",
   :doc "apply ASC CDL color transform",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this string]),
   :name "-authenticate",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-authenticate",
   :doc "decrypt image with this password",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this]),
   :name "-average",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-average",
   :doc "average a set of images",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this color]),
   :name "-background",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-background",
   :doc "the background color",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists
   ([this red]
    [this red green]
    [this red green blue]
    [this red green blue opacity]),
   :name "-black-threshold",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-black-threshold",
   :doc "pixels below the threshold become black",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this x y]),
   :name "-blue-primary",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-blue-primary",
   :doc "blue chromaticity primary point",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this radius] [this radius sigma]),
   :name "-blur",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-blur",
   :doc "blur the image with a Gaussian operator",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this width height]),
   :name "-border",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-border",
   :doc "surround the image with a border of color",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this color]),
   :name "-bordercolor",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-bordercolor",
   :doc "the border color",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this color]),
   :name "-box",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-box",
   :doc "set the color of the annotation bounding box",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this type]),
   :name "-channel",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-channel",
   :doc "the type of channel",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this factor]),
   :name "-charcoal",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-charcoal",
   :doc "simulate a charcoal drawing",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists
   ([this width height]
    [this width height x y]
    [this width height x y special]),
   :name "-chop",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-chop",
   :doc "remove pixels from the interior of an image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this]),
   :name "-clip",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-clip",
   :doc "apply the clipping path, if one is present",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this]),
   :name "-coalesce",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-coalesce",
   :doc "merge a sequence of images",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this value]),
   :name "-colorize",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-colorize",
   :doc "colorize the image with the pen color",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this value]),
   :name "-colors",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-colors",
   :doc "preferred number of colors in the image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this value]),
   :name "-colorspace",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-colorspace",
   :doc "the type of colorspace",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this string]),
   :name "-comment",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-comment",
   :doc "annotate an image with a comment",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this operator]),
   :name "-compose",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-compose",
   :doc "the type of image composition",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this type]),
   :name "-compress",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-compress",
   :doc "the type of image compression",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this]),
   :name "-contrast",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-contrast",
   :doc "enhance or reduce the image contrast",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this kernel]),
   :name "-convolve",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-convolve",
   :doc "convolve image with the specified convolution kernel",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists
   ([this width height]
    [this width height x y]
    [this width height x y special]),
   :name "-crop",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-crop",
   :doc "preferred size and location of the cropped image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this amount]),
   :name "-cycle",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-cycle",
   :doc "displace image colormap by amount",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this events]),
   :name "-debug",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-debug",
   :doc "enable debug printout",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this]),
   :name "-deconstruct",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-deconstruct",
   :doc "break down an image sequence into constituent parts",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this key] [this key value]),
   :name "-define",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-define",
   :doc "add coder/decoder specific options",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this hundredths-of-a-second]),
   :name "-delay",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-delay",
   :doc "display the next image after pausing",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this width height]),
   :name "-density",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-density",
   :doc "horizontal and vertical resolution in pixels of the image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this value]),
   :name "-depth",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-depth",
   :doc "depth of the image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this]),
   :name "-despeckle",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-despeckle",
   :doc "reduce the speckles within an image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this host display] [this host display screen]),
   :name "-display",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-display",
   :doc "specifies the X server to contact",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this method]),
   :name "-dispose",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-dispose",
   :doc "GIF disposal method",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this]),
   :name "-dither",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-dither",
   :doc "apply Floyd/Steinberg error diffusion to the image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this string]),
   :name "-draw",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-draw",
   :doc "annotate an image with one or more graphic primitives",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this radius]),
   :name "-edge",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-edge",
   :doc "detect edges within an image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this radius]),
   :name "-emboss",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-emboss",
   :doc "emboss an image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this type]),
   :name "-encoding",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-encoding",
   :doc "specify the text encoding",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this type]),
   :name "-endian",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-endian",
   :doc "specify endianness (MSB, LSB, or Native) of image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this]),
   :name "-enhance",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-enhance",
   :doc "apply a digital filter to enhance a noisy image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this]),
   :name "-equalize",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-equalize",
   :doc "perform histogram equalization to the image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this width height] [this width height x y]),
   :name "-extent",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-extent",
   :doc "composite image on background color canvas image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this color]),
   :name "-fill",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-fill",
   :doc "color to use when filling a graphic primitive",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this type]),
   :name "-filter",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-filter",
   :doc "use this type of filter when resizing an image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this]),
   :name "-flatten",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-flatten",
   :doc "flatten a sequence of images",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this]),
   :name "-flip",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-flip",
   :doc "create a \"mirror image\"",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this]),
   :name "-flop",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-flop",
   :doc "create a \"mirror image\"",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this name]),
   :name "-font",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-font",
   :doc "use this font when annotating the image with text",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this width height outer-bevel-width inner-bevel-width]),
   :name "-frame",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-frame",
   :doc "surround the image with an ornamental border",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this distance] [this distance percent?]),
   :name "-fuzz",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-fuzz",
   :doc "colors within this Euclidean distance are considered equal",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this value]),
   :name "-gamma",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-gamma",
   :doc "level of gamma correction",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this radius] [this radius sigma]),
   :name "-gaussian",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-gaussian",
   :doc "blur the image with a Gaussian operator",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists
   ([this width height]
    [this width height x y]
    [this width height x y special]),
   :name "-geometry",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-geometry",
   :doc "preferred size and location of the Image window.",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this type]),
   :name "-gravity",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-gravity",
   :doc
   "direction primitive  gravitates to when annotating the image.",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this x y]),
   :name "-green-primary",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-green-primary",
   :doc "green chromaticity primary point",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this clut]),
   :name "-hald-clut",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-hald-clut",
   :doc "apply a Hald CLUT to the image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this]),
   :name "-help",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-help",
   :doc "print usage instructions",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this factor]),
   :name "-implode",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-implode",
   :doc "implode image pixels about the center",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this type]),
   :name "-intent",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-intent",
   :doc
   "use this type of rendering intent when managing the image color",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this type]),
   :name "-interlace",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-interlace",
   :doc "the type of interlacing scheme",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this name]),
   :name "-label",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-label",
   :doc "assign a label to an image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists
   ([this width height offset] [this width height offset percent?]),
   :name "-lat",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-lat",
   :doc "perform local adaptive thresholding",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists
   ([this black-point]
    [this black-point gamma]
    [this black-point gamma white-point]
    [this black-point gamma white-point percent?]),
   :name "-level",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-level",
   :doc "adjust the level of image contrast",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this type value]),
   :name "-limit",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L456",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-limit",
   :doc "Disk, File, Map, Memory, Pixels, or Threads resource limit",
   :var-type "function",
   :line 456,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this type]),
   :name "-list",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-list",
   :doc "the type of list",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this string]),
   :name "-log",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-log",
   :doc "Specify format for debug log",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this iterations]),
   :name "-loop",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-loop",
   :doc "add Netscape loop extension to your GIF animation",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this]),
   :name "-magnify",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-magnify",
   :doc "magnify the image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this filename]),
   :name "-map",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-map",
   :doc "choose a particular set of colors from this image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this filename]),
   :name "-mask",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-mask",
   :doc "Specify a clipping mask",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this]),
   :name "-matte",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-matte",
   :doc "store matte channel if the image has one",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this color]),
   :name "-mattecolor",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-mattecolor",
   :doc "specify the color to be used with the -frame option",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this radius]),
   :name "-median",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-median",
   :doc "apply a median filter to the image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this factor]),
   :name "-minify",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-minify",
   :doc "minify the image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists
   ([this brightness]
    [this brightness saturation]
    [this brightness saturation hue]),
   :name "-modulate",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-modulate",
   :doc "vary the brightness, saturation, and hue of an image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this]),
   :name "-monitor",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-monitor",
   :doc "show progress indication",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this]),
   :name "-monochrome",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-monochrome",
   :doc "transform the image to black and white",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this frames]),
   :name "-morph",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-morph",
   :doc "morphs an image sequence",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this]),
   :name "-mosaic",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-mosaic",
   :doc "create a mosaic from an image or an image sequence",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists
   ([this radius] [this radius sigma] [this radius sigma angle]),
   :name "-motion-blur",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-motion-blur",
   :doc "Simulate motion blur",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this]),
   :name "-negate",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-negate",
   :doc "replace every pixel with its complementary color",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this radius-or-type]),
   :name "-noise",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-noise",
   :doc "add or reduce noise in an image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this]),
   :name "-noop",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-noop",
   :doc "NOOP (no option)",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this]),
   :name "-normalize",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-normalize",
   :doc "transform image to span the full range of color values",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this color]),
   :name "-opaque",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-opaque",
   :doc "change this color to the pen color within the image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists
   ([this channel operator rvalue]
    [this channel operator rvalue percent?]),
   :name "-operator",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-operator",
   :doc
   "apply a mathematical, bitwise, or value operator to an image channel",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this channeltype n-by-n]),
   :name "-ordered-dither",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-ordered-dither",
   :doc "ordered dither the image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists
   ([this width height]
    [this width height x y]
    [this width height x y special]),
   :name "-page",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-page",
   :doc "size and location of an image canvas",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this radius]),
   :name "-paint",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-paint",
   :doc "simulate an oil painting",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this color]),
   :name "-pen",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-pen",
   :doc "(This option has been replaced by the -fill option)",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this]),
   :name "-ping",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-ping",
   :doc "efficiently determine image characteristics",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this value]),
   :name "-pointsize",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-pointsize",
   :doc "pointsize of the PostScript, X11, or TrueType font",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this type]),
   :name "-preview",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-preview",
   :doc "image preview type",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this command]),
   :name "-process",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-process",
   :doc "process a sequence of images using a process module",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this filename]),
   :name "-profile",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-profile",
   :doc "add ICM, IPTC, or generic profile  to image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this value]),
   :name "-quality",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-quality",
   :doc "JPEG/MIFF/PNG/TIFF compression level",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this width height]),
   :name "-raise",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-raise",
   :doc "lighten or darken image edges",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this channeltype low-x-high]),
   :name "-random-threshold",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-random-threshold",
   :doc "random threshold the image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this matrix]),
   :name "-recolor",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-recolor",
   :doc "apply a color translation matrix to image channels",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this x y]),
   :name "-red-primary",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-red-primary",
   :doc "red chromaticity primary point",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this width height] [this width height x y]),
   :name "-region",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-region",
   :doc "apply options to a portion of the image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this]),
   :name "-render",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-render",
   :doc "render vector operations",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this horizontal vertical]),
   :name "-resample",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-resample",
   :doc
   "Resample image to specified horizontal and vertical resolution",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this width height] [this width height special]),
   :name "-resize",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-resize",
   :doc "resize an image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this x y]),
   :name "-roll",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-roll",
   :doc "roll an image vertically or horizontally",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this degrees] [this degrees special]),
   :name "-rotate",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-rotate",
   :doc "rotate the image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this geometry]),
   :name "-sample",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-sample",
   :doc "scale image using pixel sampling",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this horizontal-factor vertical-factor]),
   :name "-sampling-factor",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-sampling-factor",
   :doc "chroma subsampling factors",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this geometry]),
   :name "-scale",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-scale",
   :doc "scale the image.",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this value]),
   :name "-scene",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-scene",
   :doc "set scene number",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this cluster-threshold smoothing-threshold]),
   :name "-segment",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-segment",
   :doc "segment an image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this attribute] [this attribute value]),
   :name "-set",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L461",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-set",
   :doc "set an image attribute",
   :var-type "function",
   :line 461,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this azimuth elevation]),
   :name "-shade",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-shade",
   :doc "shade the image using a distant light source",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this radius] [this radius sigma]),
   :name "-sharpen",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-sharpen",
   :doc "sharpen the image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this width height] [this width height percent?]),
   :name "-shave",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-shave",
   :doc "shave pixels from the image edges",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this x-degrees y-degrees]),
   :name "-shear",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-shear",
   :doc "shear the image along the X or Y axis",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this width height] [this width height offset]),
   :name "-size",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-size",
   :doc "width and height of the image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this factor]),
   :name "-solarize",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-solarize",
   :doc "negate all pixels above the threshold level",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this amount]),
   :name "-spread",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-spread",
   :doc "displace image pixels by a random amount",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this color]),
   :name "-stroke",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-stroke",
   :doc "color to use when stroking a graphic primitive",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this value]),
   :name "-strokewidth",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-strokewidth",
   :doc "set the stroke width",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this degrees]),
   :name "-swirl",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-swirl",
   :doc "swirl image pixels about the center",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this filename]),
   :name "-texture",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-texture",
   :doc "name of texture to tile onto the image background",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this value] [this value percent?]),
   :name "-threshold",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-threshold",
   :doc "threshold the image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this width height] [this width height special]),
   :name "-thumbnail",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-thumbnail",
   :doc "resize an image (quickly)",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this filename]),
   :name "-tile",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-tile",
   :doc "tile image when filling a graphic primitive",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this]),
   :name "-transform",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-transform",
   :doc "transform the image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this color]),
   :name "-transparent",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-transparent",
   :doc "make this color transparent within the image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this value]),
   :name "-treedepth",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-treedepth",
   :doc "tree depth for the color reduction algorithm",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this]),
   :name "-trim",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-trim",
   :doc "trim an image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this type]),
   :name "-type",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-type",
   :doc "the image type",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this type]),
   :name "-units",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-units",
   :doc "the units of image resolution",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists
   ([this radius]
    [this radius sigma]
    [this radius sigma amount]
    [this radius sigma amount threshold]),
   :name "-unsharp",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-unsharp",
   :doc "sharpen the image with an unsharp mask operator",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this]),
   :name "-use-pixmap",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-use-pixmap",
   :doc "use the pixmap",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this]),
   :name "-verbose",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-verbose",
   :doc "print detailed information about the image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this]),
   :name "-version",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-version",
   :doc "print GraphicsMagick version string",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this string]),
   :name "-view",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-view",
   :doc "FlashPix viewing parameters",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this method]),
   :name "-virtual-pixel",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-virtual-pixel",
   :doc "specify contents of \"virtual pixels\"",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this amplitude wavelength]),
   :name "-wave",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-wave",
   :doc "alter an image along a sine wave",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this x y]),
   :name "-white-point",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-white-point",
   :doc "chromaticity white point",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists
   ([this red]
    [this red green]
    [this red green blue]
    [this red green blue opacity]),
   :name "-white-threshold",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-white-threshold",
   :doc "pixels above the threshold become white",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this filename]),
   :name "-write",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-write",
   :doc "write an intermediate image [convert, composite]",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([cmd & opts]),
   :name "run",
   :namespace "im4clj.run",
   :source-url
   "http://github.com/neatonk/im4clj/blob/8bd59ccb3968f268e6ba18714770bd59d23c3e0b/src/im4clj/run.clj#L45",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/8bd59ccb3968f268e6ba18714770bd59d23c3e0b/src/im4clj/run.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.run-api.html#im4clj.run/run",
   :doc
   "Run a command by name with the given opts. Accepts any Stringifiable\n type.\n\n Prefer pre-defined commands e.g. im4clj.core/convert.\n\n Example Usage:\n\n (run :convert \"input.jpg\" '-resize 100 \"output.jpg\")\n (run [:gm :convert] \"input.jpg\" '-resize 100 \"output.jpg\")\n",
   :var-type "function",
   :line 45,
   :file "src/im4clj/run.clj"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.run-api.html#im4clj.run/stringify",
   :namespace "im4clj.run",
   :var-type "function",
   :arglists ([this]),
   :doc "Returns a string or a sequence of strings representing this.",
   :name "stringify"}
  {:arglists ([& args]),
   :name "stringify-all",
   :namespace "im4clj.run",
   :source-url
   "http://github.com/neatonk/im4clj/blob/8bd59ccb3968f268e6ba18714770bd59d23c3e0b/src/im4clj/run.clj#L37",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/8bd59ccb3968f268e6ba18714770bd59d23c3e0b/src/im4clj/run.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.run-api.html#im4clj.run/stringify-all",
   :doc "Convert args to a flat sequence of strings.",
   :var-type "function",
   :line 37,
   :file "src/im4clj/run.clj"}
  {:arglists ([msg & form]),
   :name "debug",
   :namespace "im4clj.util.log",
   :source-url
   "http://github.com/neatonk/im4clj/blob/403c5356f49e74924f54cf684e033704689711ec/src/im4clj/util/log.clj#L15",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/403c5356f49e74924f54cf684e033704689711ec/src/im4clj/util/log.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.util.log-api.html#im4clj.util.log/debug",
   :doc "Print a debug message to *out* when *debug* is true.",
   :var-type "function",
   :line 15,
   :file "src/im4clj/util/log.clj"}
  {:arglists ([msg]),
   :name "progress",
   :namespace "im4clj.util.log",
   :source-url
   "http://github.com/neatonk/im4clj/blob/403c5356f49e74924f54cf684e033704689711ec/src/im4clj/util/log.clj#L30",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/403c5356f49e74924f54cf684e033704689711ec/src/im4clj/util/log.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.util.log-api.html#im4clj.util.log/progress",
   :doc
   "Print a progress message to *out* when *report-progress* is true.",
   :var-type "function",
   :line 30,
   :file "src/im4clj/util/log.clj"}
  {:arglists ([& body]),
   :name "with-debug",
   :namespace "im4clj.util.log",
   :source-url
   "http://github.com/neatonk/im4clj/blob/403c5356f49e74924f54cf684e033704689711ec/src/im4clj/util/log.clj#L22",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/403c5356f49e74924f54cf684e033704689711ec/src/im4clj/util/log.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.util.log-api.html#im4clj.util.log/with-debug",
   :doc "Print debug messages.",
   :var-type "macro",
   :line 22,
   :file "src/im4clj/util/log.clj"}
  {:arglists ([& body]),
   :name "with-progress",
   :namespace "im4clj.util.log",
   :source-url
   "http://github.com/neatonk/im4clj/blob/403c5356f49e74924f54cf684e033704689711ec/src/im4clj/util/log.clj#L36",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/403c5356f49e74924f54cf684e033704689711ec/src/im4clj/util/log.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.util.log-api.html#im4clj.util.log/with-progress",
   :doc "Report progress.",
   :var-type "macro",
   :line 36,
   :file "src/im4clj/util/log.clj"}
  {:arglists ([& ns-names]),
   :name "immigrate",
   :namespace "im4clj.util.ns",
   :source-url
   "http://github.com/neatonk/im4clj/blob/f91f9b6d4f7b38227cd1d71b9a85ff96a2e784b4/src/im4clj/util/ns.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/f91f9b6d4f7b38227cd1d71b9a85ff96a2e784b4/src/im4clj/util/ns.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.util.ns-api.html#im4clj.util.ns/immigrate",
   :doc
   "Create a public var in this namespace for each public var in the\nnamespaces named by ns-names. The created vars have the same name, value\nand metadata as the original except that their :ns metadata value is this\nnamespace.",
   :var-type "function",
   :line 4,
   :file "src/im4clj/util/ns.clj"}
  {:arglists ([this]),
   :name "-adjoin",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-adjoin",
   :doc "join images into a single multi-image file",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this matrix]),
   :name "-affine",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-affine",
   :doc "drawing transform matrix",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this]),
   :name "-antialias",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-antialias",
   :doc "remove pixel aliasing",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this]),
   :name "-append",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-append",
   :doc "append a set of images",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this spec]),
   :name "-asc-cdl",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-asc-cdl",
   :doc "apply ASC CDL color transform",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this string]),
   :name "-authenticate",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-authenticate",
   :doc "decrypt image with this password",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this]),
   :name "-average",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-average",
   :doc "average a set of images",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this color]),
   :name "-background",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-background",
   :doc "the background color",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists
   ([this red]
    [this red green]
    [this red green blue]
    [this red green blue opacity]),
   :name "-black-threshold",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-black-threshold",
   :doc "pixels below the threshold become black",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this x y]),
   :name "-blue-primary",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-blue-primary",
   :doc "blue chromaticity primary point",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this radius] [this radius sigma]),
   :name "-blur",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-blur",
   :doc "blur the image with a Gaussian operator",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this width height]),
   :name "-border",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-border",
   :doc "surround the image with a border of color",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this color]),
   :name "-bordercolor",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-bordercolor",
   :doc "the border color",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this color]),
   :name "-box",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-box",
   :doc "set the color of the annotation bounding box",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this type]),
   :name "-channel",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-channel",
   :doc "the type of channel",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this factor]),
   :name "-charcoal",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-charcoal",
   :doc "simulate a charcoal drawing",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists
   ([this width height]
    [this width height x y]
    [this width height x y special]),
   :name "-chop",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-chop",
   :doc "remove pixels from the interior of an image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this]),
   :name "-clip",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-clip",
   :doc "apply the clipping path, if one is present",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this]),
   :name "-coalesce",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-coalesce",
   :doc "merge a sequence of images",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this value]),
   :name "-colorize",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-colorize",
   :doc "colorize the image with the pen color",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this value]),
   :name "-colors",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-colors",
   :doc "preferred number of colors in the image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this value]),
   :name "-colorspace",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-colorspace",
   :doc "the type of colorspace",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this string]),
   :name "-comment",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-comment",
   :doc "annotate an image with a comment",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this operator]),
   :name "-compose",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-compose",
   :doc "the type of image composition",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this type]),
   :name "-compress",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-compress",
   :doc "the type of image compression",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this]),
   :name "-contrast",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-contrast",
   :doc "enhance or reduce the image contrast",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this kernel]),
   :name "-convolve",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-convolve",
   :doc "convolve image with the specified convolution kernel",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists
   ([this width height]
    [this width height x y]
    [this width height x y special]),
   :name "-crop",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-crop",
   :doc "preferred size and location of the cropped image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this amount]),
   :name "-cycle",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-cycle",
   :doc "displace image colormap by amount",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this events]),
   :name "-debug",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-debug",
   :doc "enable debug printout",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this]),
   :name "-deconstruct",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-deconstruct",
   :doc "break down an image sequence into constituent parts",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this key] [this key value]),
   :name "-define",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-define",
   :doc "add coder/decoder specific options",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this hundredths-of-a-second]),
   :name "-delay",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-delay",
   :doc "display the next image after pausing",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this width height]),
   :name "-density",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-density",
   :doc "horizontal and vertical resolution in pixels of the image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this value]),
   :name "-depth",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-depth",
   :doc "depth of the image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this]),
   :name "-despeckle",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-despeckle",
   :doc "reduce the speckles within an image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this host display] [this host display screen]),
   :name "-display",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-display",
   :doc "specifies the X server to contact",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this method]),
   :name "-dispose",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-dispose",
   :doc "GIF disposal method",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this]),
   :name "-dither",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-dither",
   :doc "apply Floyd/Steinberg error diffusion to the image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this string]),
   :name "-draw",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-draw",
   :doc "annotate an image with one or more graphic primitives",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this radius]),
   :name "-edge",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-edge",
   :doc "detect edges within an image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this radius]),
   :name "-emboss",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-emboss",
   :doc "emboss an image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this type]),
   :name "-encoding",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-encoding",
   :doc "specify the text encoding",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this type]),
   :name "-endian",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-endian",
   :doc "specify endianness (MSB, LSB, or Native) of image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this]),
   :name "-enhance",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-enhance",
   :doc "apply a digital filter to enhance a noisy image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this]),
   :name "-equalize",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-equalize",
   :doc "perform histogram equalization to the image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this width height] [this width height x y]),
   :name "-extent",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-extent",
   :doc "composite image on background color canvas image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this color]),
   :name "-fill",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-fill",
   :doc "color to use when filling a graphic primitive",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this type]),
   :name "-filter",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-filter",
   :doc "use this type of filter when resizing an image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this]),
   :name "-flatten",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-flatten",
   :doc "flatten a sequence of images",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this]),
   :name "-flip",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-flip",
   :doc "create a \"mirror image\"",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this]),
   :name "-flop",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-flop",
   :doc "create a \"mirror image\"",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this name]),
   :name "-font",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-font",
   :doc "use this font when annotating the image with text",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this width height outer-bevel-width inner-bevel-width]),
   :name "-frame",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-frame",
   :doc "surround the image with an ornamental border",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this distance] [this distance percent?]),
   :name "-fuzz",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-fuzz",
   :doc "colors within this Euclidean distance are considered equal",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this value]),
   :name "-gamma",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-gamma",
   :doc "level of gamma correction",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this radius] [this radius sigma]),
   :name "-gaussian",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-gaussian",
   :doc "blur the image with a Gaussian operator",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists
   ([this width height]
    [this width height x y]
    [this width height x y special]),
   :name "-geometry",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-geometry",
   :doc "preferred size and location of the Image window.",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this type]),
   :name "-gravity",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-gravity",
   :doc
   "direction primitive  gravitates to when annotating the image.",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this x y]),
   :name "-green-primary",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-green-primary",
   :doc "green chromaticity primary point",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this clut]),
   :name "-hald-clut",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-hald-clut",
   :doc "apply a Hald CLUT to the image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this]),
   :name "-help",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-help",
   :doc "print usage instructions",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this factor]),
   :name "-implode",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-implode",
   :doc "implode image pixels about the center",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this type]),
   :name "-intent",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-intent",
   :doc
   "use this type of rendering intent when managing the image color",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this type]),
   :name "-interlace",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-interlace",
   :doc "the type of interlacing scheme",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this name]),
   :name "-label",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-label",
   :doc "assign a label to an image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists
   ([this width height offset] [this width height offset percent?]),
   :name "-lat",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-lat",
   :doc "perform local adaptive thresholding",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists
   ([this black-point]
    [this black-point gamma]
    [this black-point gamma white-point]
    [this black-point gamma white-point percent?]),
   :name "-level",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-level",
   :doc "adjust the level of image contrast",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this type value]),
   :name "-limit",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L456",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-limit",
   :doc "Disk, File, Map, Memory, Pixels, or Threads resource limit",
   :var-type "function",
   :line 456,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this type]),
   :name "-list",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-list",
   :doc "the type of list",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this string]),
   :name "-log",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-log",
   :doc "Specify format for debug log",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this iterations]),
   :name "-loop",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-loop",
   :doc "add Netscape loop extension to your GIF animation",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this]),
   :name "-magnify",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-magnify",
   :doc "magnify the image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this filename]),
   :name "-map",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-map",
   :doc "choose a particular set of colors from this image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this filename]),
   :name "-mask",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-mask",
   :doc "Specify a clipping mask",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this]),
   :name "-matte",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-matte",
   :doc "store matte channel if the image has one",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this color]),
   :name "-mattecolor",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-mattecolor",
   :doc "specify the color to be used with the -frame option",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this radius]),
   :name "-median",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-median",
   :doc "apply a median filter to the image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this factor]),
   :name "-minify",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-minify",
   :doc "minify the image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists
   ([this brightness]
    [this brightness saturation]
    [this brightness saturation hue]),
   :name "-modulate",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-modulate",
   :doc "vary the brightness, saturation, and hue of an image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this]),
   :name "-monitor",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-monitor",
   :doc "show progress indication",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this]),
   :name "-monochrome",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-monochrome",
   :doc "transform the image to black and white",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this frames]),
   :name "-morph",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-morph",
   :doc "morphs an image sequence",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this]),
   :name "-mosaic",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-mosaic",
   :doc "create a mosaic from an image or an image sequence",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists
   ([this radius] [this radius sigma] [this radius sigma angle]),
   :name "-motion-blur",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-motion-blur",
   :doc "Simulate motion blur",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this]),
   :name "-negate",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-negate",
   :doc "replace every pixel with its complementary color",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this radius-or-type]),
   :name "-noise",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-noise",
   :doc "add or reduce noise in an image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this]),
   :name "-noop",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-noop",
   :doc "NOOP (no option)",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this]),
   :name "-normalize",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-normalize",
   :doc "transform image to span the full range of color values",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this color]),
   :name "-opaque",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-opaque",
   :doc "change this color to the pen color within the image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists
   ([this channel operator rvalue]
    [this channel operator rvalue percent?]),
   :name "-operator",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-operator",
   :doc
   "apply a mathematical, bitwise, or value operator to an image channel",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this channeltype n-by-n]),
   :name "-ordered-dither",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-ordered-dither",
   :doc "ordered dither the image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists
   ([this width height]
    [this width height x y]
    [this width height x y special]),
   :name "-page",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-page",
   :doc "size and location of an image canvas",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this radius]),
   :name "-paint",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-paint",
   :doc "simulate an oil painting",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this color]),
   :name "-pen",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-pen",
   :doc "(This option has been replaced by the -fill option)",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this]),
   :name "-ping",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-ping",
   :doc "efficiently determine image characteristics",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this value]),
   :name "-pointsize",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-pointsize",
   :doc "pointsize of the PostScript, X11, or TrueType font",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this type]),
   :name "-preview",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-preview",
   :doc "image preview type",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this command]),
   :name "-process",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-process",
   :doc "process a sequence of images using a process module",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this filename]),
   :name "-profile",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-profile",
   :doc "add ICM, IPTC, or generic profile  to image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this value]),
   :name "-quality",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-quality",
   :doc "JPEG/MIFF/PNG/TIFF compression level",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this width height]),
   :name "-raise",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-raise",
   :doc "lighten or darken image edges",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this channeltype low-x-high]),
   :name "-random-threshold",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-random-threshold",
   :doc "random threshold the image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this matrix]),
   :name "-recolor",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-recolor",
   :doc "apply a color translation matrix to image channels",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this x y]),
   :name "-red-primary",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-red-primary",
   :doc "red chromaticity primary point",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this width height] [this width height x y]),
   :name "-region",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-region",
   :doc "apply options to a portion of the image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this]),
   :name "-render",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-render",
   :doc "render vector operations",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this horizontal vertical]),
   :name "-resample",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-resample",
   :doc
   "Resample image to specified horizontal and vertical resolution",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this width height] [this width height special]),
   :name "-resize",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-resize",
   :doc "resize an image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this x y]),
   :name "-roll",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-roll",
   :doc "roll an image vertically or horizontally",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this degrees] [this degrees special]),
   :name "-rotate",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-rotate",
   :doc "rotate the image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this geometry]),
   :name "-sample",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-sample",
   :doc "scale image using pixel sampling",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this horizontal-factor vertical-factor]),
   :name "-sampling-factor",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-sampling-factor",
   :doc "chroma subsampling factors",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this geometry]),
   :name "-scale",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-scale",
   :doc "scale the image.",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this value]),
   :name "-scene",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-scene",
   :doc "set scene number",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this cluster-threshold smoothing-threshold]),
   :name "-segment",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-segment",
   :doc "segment an image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this attribute] [this attribute value]),
   :name "-set",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L461",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-set",
   :doc "set an image attribute",
   :var-type "function",
   :line 461,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this azimuth elevation]),
   :name "-shade",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-shade",
   :doc "shade the image using a distant light source",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this radius] [this radius sigma]),
   :name "-sharpen",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-sharpen",
   :doc "sharpen the image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this width height] [this width height percent?]),
   :name "-shave",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-shave",
   :doc "shave pixels from the image edges",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this x-degrees y-degrees]),
   :name "-shear",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-shear",
   :doc "shear the image along the X or Y axis",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this width height] [this width height offset]),
   :name "-size",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-size",
   :doc "width and height of the image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this factor]),
   :name "-solarize",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-solarize",
   :doc "negate all pixels above the threshold level",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this amount]),
   :name "-spread",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-spread",
   :doc "displace image pixels by a random amount",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this color]),
   :name "-stroke",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-stroke",
   :doc "color to use when stroking a graphic primitive",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this value]),
   :name "-strokewidth",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-strokewidth",
   :doc "set the stroke width",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this degrees]),
   :name "-swirl",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-swirl",
   :doc "swirl image pixels about the center",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this filename]),
   :name "-texture",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-texture",
   :doc "name of texture to tile onto the image background",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this value] [this value percent?]),
   :name "-threshold",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-threshold",
   :doc "threshold the image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this width height] [this width height special]),
   :name "-thumbnail",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-thumbnail",
   :doc "resize an image (quickly)",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this filename]),
   :name "-tile",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-tile",
   :doc "tile image when filling a graphic primitive",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this]),
   :name "-transform",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-transform",
   :doc "transform the image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this color]),
   :name "-transparent",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-transparent",
   :doc "make this color transparent within the image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this value]),
   :name "-treedepth",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-treedepth",
   :doc "tree depth for the color reduction algorithm",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this]),
   :name "-trim",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-trim",
   :doc "trim an image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this type]),
   :name "-type",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-type",
   :doc "the image type",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this type]),
   :name "-units",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-units",
   :doc "the units of image resolution",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists
   ([this radius]
    [this radius sigma]
    [this radius sigma amount]
    [this radius sigma amount threshold]),
   :name "-unsharp",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-unsharp",
   :doc "sharpen the image with an unsharp mask operator",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this]),
   :name "-use-pixmap",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-use-pixmap",
   :doc "use the pixmap",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this]),
   :name "-verbose",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-verbose",
   :doc "print detailed information about the image",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this]),
   :name "-version",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-version",
   :doc "print GraphicsMagick version string",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this string]),
   :name "-view",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-view",
   :doc "FlashPix viewing parameters",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this method]),
   :name "-virtual-pixel",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-virtual-pixel",
   :doc "specify contents of \"virtual pixels\"",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this amplitude wavelength]),
   :name "-wave",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-wave",
   :doc "alter an image along a sine wave",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this x y]),
   :name "-white-point",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-white-point",
   :doc "chromaticity white point",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists
   ([this red]
    [this red green]
    [this red green blue]
    [this red green blue opacity]),
   :name "-white-threshold",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-white-threshold",
   :doc "pixels above the threshold become white",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"}
  {:arglists ([this filename]),
   :name "-write",
   :namespace "im4clj.options.gm-convert",
   :source-url
   "http://github.com/neatonk/im4clj/blob/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/30cfa16d4f035411eb9ab3e48d9707458e165834/src/im4clj/options/gm_convert.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options.gm-convert/-write",
   :doc "write an intermediate image [convert, composite]",
   :var-type "function",
   :line 4,
   :file "src/im4clj/options/gm_convert.clj"})}

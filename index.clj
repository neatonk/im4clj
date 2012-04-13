{:namespaces
 ({:source-url
   "http://github.com/neatonk/im4clj/blob/2b80fb4084e341530d626fc58a3d62dedffc48cf/src/im4clj/command.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj/im4clj.command-api.html",
   :name "im4clj.command",
   :author "Kevin Neaton",
   :doc
   "Command infrastructure. Used by im4clj.commands to define IM/GM command-fn's for 'convert, 'identify, 'montage, etc."}
  {:source-url
   "http://github.com/neatonk/im4clj/blob/248844fa4d2c791b9de08c37e28f2d4ed3e74ad5/src/im4clj/commands.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj/im4clj.commands-api.html",
   :name "im4clj.commands",
   :author "Kevin Neaton",
   :doc
   "Command function's. Uses im4clj.command/defcommands to define named series of named fn's which run the similarly named IM/GM commands."}
  {:source-url
   "http://github.com/neatonk/im4clj/blob/2b80fb4084e341530d626fc58a3d62dedffc48cf/src/im4clj/config.clj",
   :wiki-url "http://neatonk.github.com/im4clj/im4clj.config-api.html",
   :name "im4clj.config",
   :author "Kevin Neaton",
   :doc "Configure im4clj"}
  {:source-url
   "http://github.com/neatonk/im4clj/blob/b790e1fca9e216ee70f888be9f63ce57b1f0a01e/src/im4clj/core.clj",
   :wiki-url "http://neatonk.github.com/im4clj/im4clj.core-api.html",
   :name "im4clj.core",
   :author "Kevin Neaton",
   :doc "ImageMagick for Clojure."}
  {:source-url
   "http://github.com/neatonk/im4clj/blob/15f8a1580a4d1b8de76963204aacbb88dd5abe5d/src/im4clj/defoptions.clj",
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
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj/im4clj.options-api.html",
   :name "im4clj.options",
   :author "Kevin Neaton",
   :doc "Options fn's"}
  {:source-url
   "http://github.com/neatonk/im4clj/blob/cecd3a636c2d704234ff01f2a178d15b67602a09/src/im4clj/run.clj",
   :wiki-url "http://neatonk.github.com/im4clj/im4clj.run-api.html",
   :name "im4clj.run",
   :author "Kevin Neaton",
   :doc "Stringify and run commands via im4java."}),
 :vars
 ({:arglists ([cmd] [cmd use-gm]),
   :name "command",
   :namespace "im4clj.command",
   :source-url
   "http://github.com/neatonk/im4clj/blob/2b80fb4084e341530d626fc58a3d62dedffc48cf/src/im4clj/command.clj#L25",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/2b80fb4084e341530d626fc58a3d62dedffc48cf/src/im4clj/command.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.command-api.html#im4clj.command/command",
   :doc
   "Create a new Command object for 'cmd'. When stringified, \"gm\" will be\nconditionally prepended to the result if (use-gm?) is true. Use the second\nform to force the use of im or gm.\n\nExample Usage:\n\n(command :convert)\n(command :convert true)\n",
   :var-type "function",
   :line 25,
   :file "src/im4clj/command.clj"}
  {:arglists ([cmd attr-map]),
   :name "defcommand",
   :namespace "im4clj.command",
   :source-url
   "http://github.com/neatonk/im4clj/blob/2b80fb4084e341530d626fc58a3d62dedffc48cf/src/im4clj/command.clj#L54",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/2b80fb4084e341530d626fc58a3d62dedffc48cf/src/im4clj/command.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.command-api.html#im4clj.command/defcommand",
   :doc
   "Define a new command-fn. Takes a symbol and an attr-map representing the\ncommand to be defined. If present in attr-map, the keys :arglists and\n:examples are treated specially. All keys are retained as meta-data for the\nsymbol provided.\n\n(defcommand convert\n  {:examples '[(convert \"input.jpg\" \"-resize\" \"640x480\" \"output.jpg\")\n               (convert (-> \"input.jpg\" (-resize 640 480)) \"output.jpg\")\n               (convert (-resize \"input.jpg\" 640 480) \"output.jpg\")]\n   :arglists '([options? input-file? options? output-file])})",
   :var-type "macro",
   :line 54,
   :file "src/im4clj/command.clj"}
  {:arglists ([attr-map? & specs]),
   :name "defcommands",
   :namespace "im4clj.command",
   :source-url
   "http://github.com/neatonk/im4clj/blob/2b80fb4084e341530d626fc58a3d62dedffc48cf/src/im4clj/command.clj#L76",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/2b80fb4084e341530d626fc58a3d62dedffc48cf/src/im4clj/command.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.command-api.html#im4clj.command/defcommands",
   :doc
   "Define a number of command-fn's from the given specs. If a map is provided\nprior to the specs it's contents will be applied to each spec.",
   :var-type "macro",
   :line 76,
   :file "src/im4clj/command.clj"}
  {:arglists ([options? files*]),
   :name "animate",
   :namespace "im4clj.commands",
   :source-url
   "http://github.com/neatonk/im4clj/blob/248844fa4d2c791b9de08c37e28f2d4ed3e74ad5/src/im4clj/commands.clj#L15",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/248844fa4d2c791b9de08c37e28f2d4ed3e74ad5/src/im4clj/commands.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.commands-api.html#im4clj.commands/animate",
   :doc
   "Run the animate command with the given argument form. See IM/GM documentation for detailed usage.\n\nExample Usage: \n\n(animate \"cockatoo.*\")\n(animate \"-map\" \"best\" \"cockatoo.*\")",
   :var-type "function",
   :line 15,
   :file "src/im4clj/commands.clj"}
  {:arglists
   ([options? reference-image options? compare-image options?]),
   :name "compare",
   :namespace "im4clj.commands",
   :source-url
   "http://github.com/neatonk/im4clj/blob/248844fa4d2c791b9de08c37e28f2d4ed3e74ad5/src/im4clj/commands.clj#L15",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/248844fa4d2c791b9de08c37e28f2d4ed3e74ad5/src/im4clj/commands.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.commands-api.html#im4clj.commands/compare",
   :doc
   "Run the compare command with the given argument form. See IM/GM documentation for detailed usage.\n\nExample Usage: TODO: add example usage.",
   :var-type "function",
   :line 15,
   :file "src/im4clj/commands.clj"}
  {:arglists
   ([options? change-image base-image mask-image? output-image]),
   :name "composite",
   :namespace "im4clj.commands",
   :source-url
   "http://github.com/neatonk/im4clj/blob/248844fa4d2c791b9de08c37e28f2d4ed3e74ad5/src/im4clj/commands.clj#L15",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/248844fa4d2c791b9de08c37e28f2d4ed3e74ad5/src/im4clj/commands.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.commands-api.html#im4clj.commands/composite",
   :doc
   "Run the composite command with the given argument form. See IM/GM documentation for detailed usage.\n\nExample Usage: TODO: add example usage.",
   :var-type "function",
   :line 15,
   :file "src/im4clj/commands.clj"}
  {:arglists ([options? script.msl & more]),
   :name "conjure",
   :namespace "im4clj.commands",
   :source-url
   "http://github.com/neatonk/im4clj/blob/248844fa4d2c791b9de08c37e28f2d4ed3e74ad5/src/im4clj/commands.clj#L15",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/248844fa4d2c791b9de08c37e28f2d4ed3e74ad5/src/im4clj/commands.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.commands-api.html#im4clj.commands/conjure",
   :doc
   "Run the conjure command with the given argument form. See IM/GM documentation for detailed usage.\n\nExample Usage: TODO: add example usage.",
   :var-type "function",
   :line 15,
   :file "src/im4clj/commands.clj"}
  {:arglists ([options? input-file? options? output-file]),
   :name "convert",
   :namespace "im4clj.commands",
   :source-url
   "http://github.com/neatonk/im4clj/blob/248844fa4d2c791b9de08c37e28f2d4ed3e74ad5/src/im4clj/commands.clj#L57",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/248844fa4d2c791b9de08c37e28f2d4ed3e74ad5/src/im4clj/commands.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.commands-api.html#im4clj.commands/convert",
   :doc
   "Run the convert command with the given argument form. See IM/GM documentation for detailed usage.\n\nExample Usage: \n\n(convert \"input.jpg\" \"-resize\" \"640x480\" \"output.jpg\")\n(convert (-> \"input.jpg\" (-resize 640 480)) \"output.jpg\")\n(convert (-resize \"input.jpg\" 640 480) \"output.jpg\")",
   :var-type "function",
   :line 57,
   :file "src/im4clj/commands.clj"}
  {:arglists ([options? files* & more]),
   :name "display",
   :namespace "im4clj.commands",
   :source-url
   "http://github.com/neatonk/im4clj/blob/248844fa4d2c791b9de08c37e28f2d4ed3e74ad5/src/im4clj/commands.clj#L15",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/248844fa4d2c791b9de08c37e28f2d4ed3e74ad5/src/im4clj/commands.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.commands-api.html#im4clj.commands/display",
   :doc
   "Run the display command with the given argument form. See IM/GM documentation for detailed usage.\n\nExample Usage: TODO: add example usage.",
   :var-type "function",
   :line 15,
   :file "src/im4clj/commands.clj"}
  {:arglists ([files*]),
   :name "identify",
   :namespace "im4clj.commands",
   :source-url
   "http://github.com/neatonk/im4clj/blob/248844fa4d2c791b9de08c37e28f2d4ed3e74ad5/src/im4clj/commands.clj#L15",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/248844fa4d2c791b9de08c37e28f2d4ed3e74ad5/src/im4clj/commands.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.commands-api.html#im4clj.commands/identify",
   :doc
   "Run the identify command with the given argument form. See IM/GM documentation for detailed usage.\n\nExample Usage: TODO: add example usage.",
   :var-type "function",
   :line 15,
   :file "src/im4clj/commands.clj"}
  {:arglists ([options? file]),
   :name "import",
   :namespace "im4clj.commands",
   :source-url
   "http://github.com/neatonk/im4clj/blob/248844fa4d2c791b9de08c37e28f2d4ed3e74ad5/src/im4clj/commands.clj#L15",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/248844fa4d2c791b9de08c37e28f2d4ed3e74ad5/src/im4clj/commands.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.commands-api.html#im4clj.commands/import",
   :doc
   "Run the import command with the given argument form. See IM/GM documentation for detailed usage.\n\nExample Usage: TODO: add example usage.",
   :var-type "function",
   :line 15,
   :file "src/im4clj/commands.clj"}
  {:arglists ([options? files*]),
   :name "mogrify",
   :namespace "im4clj.commands",
   :source-url
   "http://github.com/neatonk/im4clj/blob/248844fa4d2c791b9de08c37e28f2d4ed3e74ad5/src/im4clj/commands.clj#L15",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/248844fa4d2c791b9de08c37e28f2d4ed3e74ad5/src/im4clj/commands.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.commands-api.html#im4clj.commands/mogrify",
   :doc
   "Run the mogrify command with the given argument form. See IM/GM documentation for detailed usage.\n\nExample Usage: TODO: add example usage.",
   :var-type "function",
   :line 15,
   :file "src/im4clj/commands.clj"}
  {:arglists ([options? file options-and-files? output-file]),
   :name "montage",
   :namespace "im4clj.commands",
   :source-url
   "http://github.com/neatonk/im4clj/blob/248844fa4d2c791b9de08c37e28f2d4ed3e74ad5/src/im4clj/commands.clj#L15",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/248844fa4d2c791b9de08c37e28f2d4ed3e74ad5/src/im4clj/commands.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.commands-api.html#im4clj.commands/montage",
   :doc
   "Run the montage command with the given argument form. See IM/GM documentation for detailed usage.\n\nExample Usage: TODO: add example usage.",
   :var-type "function",
   :line 15,
   :file "src/im4clj/commands.clj"}
  {:arglists ([]),
   :name "use-gm",
   :namespace "im4clj.config",
   :source-url
   "http://github.com/neatonk/im4clj/blob/2b80fb4084e341530d626fc58a3d62dedffc48cf/src/im4clj/config.clj#L18",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/2b80fb4084e341530d626fc58a3d62dedffc48cf/src/im4clj/config.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.config-api.html#im4clj.config/use-gm",
   :doc "Get the thread-local value of *use-gm*.",
   :var-type "function",
   :line 18,
   :file "src/im4clj/config.clj"}
  {:arglists ([] [bool]),
   :name "use-gm!",
   :namespace "im4clj.config",
   :source-url
   "http://github.com/neatonk/im4clj/blob/2b80fb4084e341530d626fc58a3d62dedffc48cf/src/im4clj/config.clj#L22",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/2b80fb4084e341530d626fc58a3d62dedffc48cf/src/im4clj/config.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.config-api.html#im4clj.config/use-gm!",
   :doc "Set the thread-local value of *use-gm*.",
   :var-type "function",
   :line 22,
   :file "src/im4clj/config.clj"}
  {:arglists ([]),
   :name "use-gm?",
   :namespace "im4clj.config",
   :source-url
   "http://github.com/neatonk/im4clj/blob/2b80fb4084e341530d626fc58a3d62dedffc48cf/src/im4clj/config.clj#L27",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/2b80fb4084e341530d626fc58a3d62dedffc48cf/src/im4clj/config.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.config-api.html#im4clj.config/use-gm?",
   :doc
   "Predicate. Returns true if *use-gm* is bound to true. Use with-gm and with-im\nfor binding.",
   :var-type "function",
   :line 27,
   :file "src/im4clj/config.clj"}
  {:arglists ([]),
   :name "use-im?",
   :namespace "im4clj.config",
   :source-url
   "http://github.com/neatonk/im4clj/blob/2b80fb4084e341530d626fc58a3d62dedffc48cf/src/im4clj/config.clj#L32",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/2b80fb4084e341530d626fc58a3d62dedffc48cf/src/im4clj/config.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.config-api.html#im4clj.config/use-im?",
   :doc
   "Predicate. Returns true if *use-gm* is bound to false. Use with-gm and with-im\nfor binding.",
   :var-type "function",
   :line 32,
   :file "src/im4clj/config.clj"}
  {:arglists ([& body]),
   :name "with-gm",
   :namespace "im4clj.config",
   :source-url
   "http://github.com/neatonk/im4clj/blob/2b80fb4084e341530d626fc58a3d62dedffc48cf/src/im4clj/config.clj#L37",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/2b80fb4084e341530d626fc58a3d62dedffc48cf/src/im4clj/config.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.config-api.html#im4clj.config/with-gm",
   :doc "Evaluates 'body' with *use-gm* bound to true.",
   :var-type "macro",
   :line 37,
   :file "src/im4clj/config.clj"}
  {:arglists ([& body]),
   :name "with-im",
   :namespace "im4clj.config",
   :source-url
   "http://github.com/neatonk/im4clj/blob/2b80fb4084e341530d626fc58a3d62dedffc48cf/src/im4clj/config.clj#L43",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/2b80fb4084e341530d626fc58a3d62dedffc48cf/src/im4clj/config.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.config-api.html#im4clj.config/with-im",
   :doc "Evaluates 'body' with *use-gm* bound to false.",
   :var-type "macro",
   :line 43,
   :file "src/im4clj/config.clj"}
  {:arglists ([]),
   :name "-adjoin",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-adjoin",
   :doc "join images into a single multi-image file",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([matrix]),
   :name "-affine",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-affine",
   :doc "drawing transform matrix",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([]),
   :name "-antialias",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-antialias",
   :doc "remove pixel aliasing",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([]),
   :name "-append",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-append",
   :doc "append a set of images",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([spec]),
   :name "-asc-cdl",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-asc-cdl",
   :doc "apply ASC CDL color transform",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([string]),
   :name "-authenticate",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-authenticate",
   :doc "decrypt image with this password",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([]),
   :name "-average",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-average",
   :doc "average a set of images",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([color]),
   :name "-background",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-background",
   :doc "the background color",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists
   ([red] [red green] [red green blue] [red green blue opacity]),
   :name "-black-threshold",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-black-threshold",
   :doc "pixels below the threshold become black",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([x y]),
   :name "-blue-primary",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-blue-primary",
   :doc "blue chromaticity primary point",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([radius] [radius sigma]),
   :name "-blur",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-blur",
   :doc "blur the image with a Gaussian operator",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([width height]),
   :name "-border",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-border",
   :doc "surround the image with a border of color",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([color]),
   :name "-bordercolor",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-bordercolor",
   :doc "the border color",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([color]),
   :name "-box",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-box",
   :doc "set the color of the annotation bounding box",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([type]),
   :name "-channel",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-channel",
   :doc "the type of channel",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([factor]),
   :name "-charcoal",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-charcoal",
   :doc "simulate a charcoal drawing",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists
   ([width height] [width height x y] [width height x y special]),
   :name "-chop",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-chop",
   :doc "remove pixels from the interior of an image",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([]),
   :name "-clip",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-clip",
   :doc "apply the clipping path, if one is present",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([]),
   :name "-coalesce",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-coalesce",
   :doc "merge a sequence of images",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([value]),
   :name "-colorize",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-colorize",
   :doc "colorize the image with the pen color",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([value]),
   :name "-colors",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-colors",
   :doc "preferred number of colors in the image",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([value]),
   :name "-colorspace",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-colorspace",
   :doc "the type of colorspace",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([string]),
   :name "-comment",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-comment",
   :doc "annotate an image with a comment",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([operator]),
   :name "-compose",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-compose",
   :doc "the type of image composition",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([type]),
   :name "-compress",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-compress",
   :doc "the type of image compression",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([]),
   :name "-contrast",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-contrast",
   :doc "enhance or reduce the image contrast",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([kernel]),
   :name "-convolve",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-convolve",
   :doc "convolve image with the specified convolution kernel",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists
   ([width height] [width height x y] [width height x y special]),
   :name "-crop",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-crop",
   :doc "preferred size and location of the cropped image",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([amount]),
   :name "-cycle",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-cycle",
   :doc "displace image colormap by amount",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([events]),
   :name "-debug",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-debug",
   :doc "enable debug printout",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([]),
   :name "-deconstruct",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-deconstruct",
   :doc "break down an image sequence into constituent parts",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([key] [key value]),
   :name "-define",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-define",
   :doc "add coder/decoder specific options",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([hundredths-of-a-second]),
   :name "-delay",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-delay",
   :doc "display the next image after pausing",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([width height]),
   :name "-density",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-density",
   :doc "horizontal and vertical resolution in pixels of the image",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([value]),
   :name "-depth",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-depth",
   :doc "depth of the image",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([]),
   :name "-despeckle",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-despeckle",
   :doc "reduce the speckles within an image",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([host display] [host display screen]),
   :name "-display",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-display",
   :doc "specifies the X server to contact",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([method]),
   :name "-dispose",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-dispose",
   :doc "GIF disposal method",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([]),
   :name "-dither",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-dither",
   :doc "apply Floyd/Steinberg error diffusion to the image",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([string]),
   :name "-draw",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-draw",
   :doc "annotate an image with one or more graphic primitives",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([radius]),
   :name "-edge",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-edge",
   :doc "detect edges within an image",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([radius]),
   :name "-emboss",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-emboss",
   :doc "emboss an image",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([type]),
   :name "-encoding",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-encoding",
   :doc "specify the text encoding",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([type]),
   :name "-endian",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-endian",
   :doc "specify endianness (MSB, LSB, or Native) of image",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([]),
   :name "-enhance",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-enhance",
   :doc "apply a digital filter to enhance a noisy image",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([]),
   :name "-equalize",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-equalize",
   :doc "perform histogram equalization to the image",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([width height] [width height x y]),
   :name "-extent",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-extent",
   :doc "composite image on background color canvas image",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([color]),
   :name "-fill",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-fill",
   :doc "color to use when filling a graphic primitive",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([type]),
   :name "-filter",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-filter",
   :doc "use this type of filter when resizing an image",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([]),
   :name "-flatten",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-flatten",
   :doc "flatten a sequence of images",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([]),
   :name "-flip",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-flip",
   :doc "create a \"mirror image\"",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([]),
   :name "-flop",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-flop",
   :doc "create a \"mirror image\"",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([name]),
   :name "-font",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-font",
   :doc "use this font when annotating the image with text",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([width height outer-bevel-width inner-bevel-width]),
   :name "-frame",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-frame",
   :doc "surround the image with an ornamental border",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([distance] [distance percent?]),
   :name "-fuzz",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-fuzz",
   :doc "colors within this Euclidean distance are considered equal",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([value]),
   :name "-gamma",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-gamma",
   :doc "level of gamma correction",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([radius] [radius sigma]),
   :name "-gaussian",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-gaussian",
   :doc "blur the image with a Gaussian operator",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists
   ([width height] [width height x y] [width height x y special]),
   :name "-geometry",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-geometry",
   :doc "preferred size and location of the Image window.",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([type]),
   :name "-gravity",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-gravity",
   :doc
   "direction primitive  gravitates to when annotating the image.",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([x y]),
   :name "-green-primary",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-green-primary",
   :doc "green chromaticity primary point",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([clut]),
   :name "-hald-clut",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-hald-clut",
   :doc "apply a Hald CLUT to the image",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([]),
   :name "-help",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-help",
   :doc "print usage instructions",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([factor]),
   :name "-implode",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-implode",
   :doc "implode image pixels about the center",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([type]),
   :name "-intent",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-intent",
   :doc
   "use this type of rendering intent when managing the image color",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([type]),
   :name "-interlace",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-interlace",
   :doc "the type of interlacing scheme",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([name]),
   :name "-label",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-label",
   :doc "assign a label to an image",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([width height offset] [width height offset percent?]),
   :name "-lat",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-lat",
   :doc "perform local adaptive thresholding",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists
   ([black-point]
    [black-point gamma]
    [black-point gamma white-point]
    [black-point gamma white-point percent?]),
   :name "-level",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-level",
   :doc "adjust the level of image contrast",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([type value]),
   :name "-limit",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L467",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-limit",
   :doc "Disk, File, Map, Memory, Pixels, or Threads resource limit",
   :var-type "function",
   :line 467,
   :file "src/im4clj/options.clj"}
  {:arglists ([type]),
   :name "-list",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-list",
   :doc "the type of list",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([string]),
   :name "-log",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-log",
   :doc "Specify format for debug log",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([iterations]),
   :name "-loop",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-loop",
   :doc "add Netscape loop extension to your GIF animation",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([]),
   :name "-magnify",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-magnify",
   :doc "magnify the image",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([filename]),
   :name "-map",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-map",
   :doc "choose a particular set of colors from this image",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([filename]),
   :name "-mask",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-mask",
   :doc "Specify a clipping mask",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([]),
   :name "-matte",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-matte",
   :doc "store matte channel if the image has one",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([color]),
   :name "-mattecolor",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-mattecolor",
   :doc "specify the color to be used with the -frame option",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([radius]),
   :name "-median",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-median",
   :doc "apply a median filter to the image",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([factor]),
   :name "-minify",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-minify",
   :doc "minify the image",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists
   ([brightness] [brightness saturation] [brightness saturation hue]),
   :name "-modulate",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-modulate",
   :doc "vary the brightness, saturation, and hue of an image",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([]),
   :name "-monitor",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-monitor",
   :doc "show progress indication",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([]),
   :name "-monochrome",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-monochrome",
   :doc "transform the image to black and white",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([frames]),
   :name "-morph",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-morph",
   :doc "morphs an image sequence",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([]),
   :name "-mosaic",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-mosaic",
   :doc "create a mosaic from an image or an image sequence",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([radius] [radius sigma] [radius sigma angle]),
   :name "-motion-blur",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-motion-blur",
   :doc "Simulate motion blur",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([]),
   :name "-negate",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-negate",
   :doc "replace every pixel with its complementary color",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([radius-or-type]),
   :name "-noise",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-noise",
   :doc "add or reduce noise in an image",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([]),
   :name "-noop",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-noop",
   :doc "NOOP (no option)",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([]),
   :name "-normalize",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-normalize",
   :doc "transform image to span the full range of color values",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([color]),
   :name "-opaque",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-opaque",
   :doc "change this color to the pen color within the image",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists
   ([channel operator rvalue] [channel operator rvalue percent?]),
   :name "-operator",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-operator",
   :doc
   "apply a mathematical, bitwise, or value operator to an image channel",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([channeltype n-by-n]),
   :name "-ordered-dither",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-ordered-dither",
   :doc "ordered dither the image",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists
   ([width height] [width height x y] [width height x y special]),
   :name "-page",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-page",
   :doc "size and location of an image canvas",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([radius]),
   :name "-paint",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-paint",
   :doc "simulate an oil painting",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([color]),
   :name "-pen",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-pen",
   :doc "(This option has been replaced by the -fill option)",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([]),
   :name "-ping",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-ping",
   :doc "efficiently determine image characteristics",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([value]),
   :name "-pointsize",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-pointsize",
   :doc "pointsize of the PostScript, X11, or TrueType font",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([type]),
   :name "-preview",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-preview",
   :doc "image preview type",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([command]),
   :name "-process",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-process",
   :doc "process a sequence of images using a process module",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([filename]),
   :name "-profile",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-profile",
   :doc "add ICM, IPTC, or generic profile  to image",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([value]),
   :name "-quality",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-quality",
   :doc "JPEG/MIFF/PNG/TIFF compression level",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([width height]),
   :name "-raise",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-raise",
   :doc "lighten or darken image edges",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([channeltype low-x-high]),
   :name "-random-threshold",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-random-threshold",
   :doc "random threshold the image",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([matrix]),
   :name "-recolor",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-recolor",
   :doc "apply a color translation matrix to image channels",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([x y]),
   :name "-red-primary",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-red-primary",
   :doc "red chromaticity primary point",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([width height] [width height x y]),
   :name "-region",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-region",
   :doc "apply options to a portion of the image",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([]),
   :name "-render",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-render",
   :doc "render vector operations",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([horizontal vertical]),
   :name "-resample",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-resample",
   :doc
   "Resample image to specified horizontal and vertical resolution",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([width height] [width height special]),
   :name "-resize",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-resize",
   :doc "resize an image",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([x y]),
   :name "-roll",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-roll",
   :doc "roll an image vertically or horizontally",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([degrees] [degrees special]),
   :name "-rotate",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-rotate",
   :doc "rotate the image",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([geometry]),
   :name "-sample",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-sample",
   :doc "scale image using pixel sampling",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([horizontal-factor vertical-factor]),
   :name "-sampling-factor",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-sampling-factor",
   :doc "chroma subsampling factors",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([geometry]),
   :name "-scale",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-scale",
   :doc "scale the image.",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([value]),
   :name "-scene",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-scene",
   :doc "set scene number",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([cluster-threshold smoothing-threshold]),
   :name "-segment",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-segment",
   :doc "segment an image",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([attribute] [attribute value]),
   :name "-set",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L472",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-set",
   :doc "set an image attribute",
   :var-type "function",
   :line 472,
   :file "src/im4clj/options.clj"}
  {:arglists ([azimuth elevation]),
   :name "-shade",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-shade",
   :doc "shade the image using a distant light source",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([radius] [radius sigma]),
   :name "-sharpen",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-sharpen",
   :doc "sharpen the image",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([width height] [width height percent?]),
   :name "-shave",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-shave",
   :doc "shave pixels from the image edges",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([x-degrees y-degrees]),
   :name "-shear",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-shear",
   :doc "shear the image along the X or Y axis",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([width height] [width height offset]),
   :name "-size",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-size",
   :doc "width and height of the image",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([factor]),
   :name "-solarize",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-solarize",
   :doc "negate all pixels above the threshold level",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([amount]),
   :name "-spread",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-spread",
   :doc "displace image pixels by a random amount",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([color]),
   :name "-stroke",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-stroke",
   :doc "color to use when stroking a graphic primitive",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([value]),
   :name "-strokewidth",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-strokewidth",
   :doc "set the stroke width",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([degrees]),
   :name "-swirl",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-swirl",
   :doc "swirl image pixels about the center",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([filename]),
   :name "-texture",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-texture",
   :doc "name of texture to tile onto the image background",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([value] [value percent?]),
   :name "-threshold",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-threshold",
   :doc "threshold the image",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([width height] [width height special]),
   :name "-thumbnail",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-thumbnail",
   :doc "resize an image (quickly)",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([filename]),
   :name "-tile",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-tile",
   :doc "tile image when filling a graphic primitive",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([]),
   :name "-transform",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-transform",
   :doc "transform the image",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([color]),
   :name "-transparent",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-transparent",
   :doc "make this color transparent within the image",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([value]),
   :name "-treedepth",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-treedepth",
   :doc "tree depth for the color reduction algorithm",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([]),
   :name "-trim",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-trim",
   :doc "trim an image",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([type]),
   :name "-type",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-type",
   :doc "the image type",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([type]),
   :name "-units",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-units",
   :doc "the units of image resolution",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists
   ([radius]
    [radius sigma]
    [radius sigma amount]
    [radius sigma amount threshold]),
   :name "-unsharp",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-unsharp",
   :doc "sharpen the image with an unsharp mask operator",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([]),
   :name "-use-pixmap",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-use-pixmap",
   :doc "use the pixmap",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([]),
   :name "-verbose",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-verbose",
   :doc "print detailed information about the image",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([]),
   :name "-version",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-version",
   :doc "print GraphicsMagick version string",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([string]),
   :name "-view",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-view",
   :doc "FlashPix viewing parameters",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([method]),
   :name "-virtual-pixel",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-virtual-pixel",
   :doc "specify contents of \"virtual pixels\"",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([amplitude wavelength]),
   :name "-wave",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-wave",
   :doc "alter an image along a sine wave",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([x y]),
   :name "-white-point",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-white-point",
   :doc "chromaticity white point",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists
   ([red] [red green] [red green blue] [red green blue opacity]),
   :name "-white-threshold",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-white-threshold",
   :doc "pixels above the threshold become white",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([filename]),
   :name "-write",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/-write",
   :doc "write an intermediate image [convert, composite]",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([options? files*]),
   :name "animate",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/248844fa4d2c791b9de08c37e28f2d4ed3e74ad5/src/im4clj/commands.clj#L15",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/248844fa4d2c791b9de08c37e28f2d4ed3e74ad5/src/im4clj/commands.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/animate",
   :doc
   "Run the animate command with the given argument form. See IM/GM documentation for detailed usage.\n\nExample Usage: \n\n(animate \"cockatoo.*\")\n(animate \"-map\" \"best\" \"cockatoo.*\")",
   :var-type "function",
   :line 15,
   :file "src/im4clj/commands.clj"}
  {:arglists
   ([options? reference-image options? compare-image options?]),
   :name "compare",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/248844fa4d2c791b9de08c37e28f2d4ed3e74ad5/src/im4clj/commands.clj#L15",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/248844fa4d2c791b9de08c37e28f2d4ed3e74ad5/src/im4clj/commands.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/compare",
   :doc
   "Run the compare command with the given argument form. See IM/GM documentation for detailed usage.\n\nExample Usage: TODO: add example usage.",
   :var-type "function",
   :line 15,
   :file "src/im4clj/commands.clj"}
  {:arglists
   ([options? change-image base-image mask-image? output-image]),
   :name "composite",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/248844fa4d2c791b9de08c37e28f2d4ed3e74ad5/src/im4clj/commands.clj#L15",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/248844fa4d2c791b9de08c37e28f2d4ed3e74ad5/src/im4clj/commands.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/composite",
   :doc
   "Run the composite command with the given argument form. See IM/GM documentation for detailed usage.\n\nExample Usage: TODO: add example usage.",
   :var-type "function",
   :line 15,
   :file "src/im4clj/commands.clj"}
  {:arglists ([options? script.msl & more]),
   :name "conjure",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/248844fa4d2c791b9de08c37e28f2d4ed3e74ad5/src/im4clj/commands.clj#L15",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/248844fa4d2c791b9de08c37e28f2d4ed3e74ad5/src/im4clj/commands.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/conjure",
   :doc
   "Run the conjure command with the given argument form. See IM/GM documentation for detailed usage.\n\nExample Usage: TODO: add example usage.",
   :var-type "function",
   :line 15,
   :file "src/im4clj/commands.clj"}
  {:arglists ([options? input-file? options? output-file]),
   :name "convert",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/248844fa4d2c791b9de08c37e28f2d4ed3e74ad5/src/im4clj/commands.clj#L57",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/248844fa4d2c791b9de08c37e28f2d4ed3e74ad5/src/im4clj/commands.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/convert",
   :doc
   "Run the convert command with the given argument form. See IM/GM documentation for detailed usage.\n\nExample Usage: \n\n(convert \"input.jpg\" \"-resize\" \"640x480\" \"output.jpg\")\n(convert (-> \"input.jpg\" (-resize 640 480)) \"output.jpg\")\n(convert (-resize \"input.jpg\" 640 480) \"output.jpg\")",
   :var-type "function",
   :line 57,
   :file "src/im4clj/commands.clj"}
  {:arglists ([options? files* & more]),
   :name "display",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/248844fa4d2c791b9de08c37e28f2d4ed3e74ad5/src/im4clj/commands.clj#L15",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/248844fa4d2c791b9de08c37e28f2d4ed3e74ad5/src/im4clj/commands.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/display",
   :doc
   "Run the display command with the given argument form. See IM/GM documentation for detailed usage.\n\nExample Usage: TODO: add example usage.",
   :var-type "function",
   :line 15,
   :file "src/im4clj/commands.clj"}
  {:arglists ([files*]),
   :name "identify",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/248844fa4d2c791b9de08c37e28f2d4ed3e74ad5/src/im4clj/commands.clj#L15",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/248844fa4d2c791b9de08c37e28f2d4ed3e74ad5/src/im4clj/commands.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/identify",
   :doc
   "Run the identify command with the given argument form. See IM/GM documentation for detailed usage.\n\nExample Usage: TODO: add example usage.",
   :var-type "function",
   :line 15,
   :file "src/im4clj/commands.clj"}
  {:arglists ([options? file]),
   :name "import",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/248844fa4d2c791b9de08c37e28f2d4ed3e74ad5/src/im4clj/commands.clj#L15",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/248844fa4d2c791b9de08c37e28f2d4ed3e74ad5/src/im4clj/commands.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/import",
   :doc
   "Run the import command with the given argument form. See IM/GM documentation for detailed usage.\n\nExample Usage: TODO: add example usage.",
   :var-type "function",
   :line 15,
   :file "src/im4clj/commands.clj"}
  {:arglists ([options? files*]),
   :name "mogrify",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/248844fa4d2c791b9de08c37e28f2d4ed3e74ad5/src/im4clj/commands.clj#L15",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/248844fa4d2c791b9de08c37e28f2d4ed3e74ad5/src/im4clj/commands.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/mogrify",
   :doc
   "Run the mogrify command with the given argument form. See IM/GM documentation for detailed usage.\n\nExample Usage: TODO: add example usage.",
   :var-type "function",
   :line 15,
   :file "src/im4clj/commands.clj"}
  {:arglists ([options? file options-and-files? output-file]),
   :name "montage",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/248844fa4d2c791b9de08c37e28f2d4ed3e74ad5/src/im4clj/commands.clj#L15",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/248844fa4d2c791b9de08c37e28f2d4ed3e74ad5/src/im4clj/commands.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/montage",
   :doc
   "Run the montage command with the given argument form. See IM/GM documentation for detailed usage.\n\nExample Usage: TODO: add example usage.",
   :var-type "function",
   :line 15,
   :file "src/im4clj/commands.clj"}
  {:arglists ([]),
   :name "use-gm",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/2b80fb4084e341530d626fc58a3d62dedffc48cf/src/im4clj/config.clj#L18",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/2b80fb4084e341530d626fc58a3d62dedffc48cf/src/im4clj/config.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/use-gm",
   :doc "Get the thread-local value of *use-gm*.",
   :var-type "function",
   :line 18,
   :file "src/im4clj/config.clj"}
  {:arglists ([] [bool]),
   :name "use-gm!",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/2b80fb4084e341530d626fc58a3d62dedffc48cf/src/im4clj/config.clj#L22",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/2b80fb4084e341530d626fc58a3d62dedffc48cf/src/im4clj/config.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/use-gm!",
   :doc "Set the thread-local value of *use-gm*.",
   :var-type "function",
   :line 22,
   :file "src/im4clj/config.clj"}
  {:arglists ([]),
   :name "use-gm?",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/2b80fb4084e341530d626fc58a3d62dedffc48cf/src/im4clj/config.clj#L27",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/2b80fb4084e341530d626fc58a3d62dedffc48cf/src/im4clj/config.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/use-gm?",
   :doc
   "Predicate. Returns true if *use-gm* is bound to true. Use with-gm and with-im\nfor binding.",
   :var-type "function",
   :line 27,
   :file "src/im4clj/config.clj"}
  {:arglists ([]),
   :name "use-im?",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/2b80fb4084e341530d626fc58a3d62dedffc48cf/src/im4clj/config.clj#L32",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/2b80fb4084e341530d626fc58a3d62dedffc48cf/src/im4clj/config.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/use-im?",
   :doc
   "Predicate. Returns true if *use-gm* is bound to false. Use with-gm and with-im\nfor binding.",
   :var-type "function",
   :line 32,
   :file "src/im4clj/config.clj"}
  {:arglists ([& body]),
   :name "with-gm",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/2b80fb4084e341530d626fc58a3d62dedffc48cf/src/im4clj/config.clj#L37",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/2b80fb4084e341530d626fc58a3d62dedffc48cf/src/im4clj/config.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/with-gm",
   :doc "Evaluates 'body' with *use-gm* bound to true.",
   :var-type "macro",
   :line 37,
   :file "src/im4clj/config.clj"}
  {:arglists ([& body]),
   :name "with-im",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/2b80fb4084e341530d626fc58a3d62dedffc48cf/src/im4clj/config.clj#L43",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/2b80fb4084e341530d626fc58a3d62dedffc48cf/src/im4clj/config.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/with-im",
   :doc "Evaluates 'body' with *use-gm* bound to false.",
   :var-type "macro",
   :line 43,
   :file "src/im4clj/config.clj"}
  {:arglists ([opt argspec attr-map]),
   :name "defoption",
   :namespace "im4clj.defoptions",
   :source-url
   "http://github.com/neatonk/im4clj/blob/15f8a1580a4d1b8de76963204aacbb88dd5abe5d/src/im4clj/defoptions.clj#L55",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/15f8a1580a4d1b8de76963204aacbb88dd5abe5d/src/im4clj/defoptions.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.defoptions-api.html#im4clj.defoptions/defoption",
   :doc
   "Define a new option-fn. Takes a symbol, one or more argspecs, and an attr-map.\n\nargspec => [required-form [optional-form]+]\nrequired-form => constant-or-symbol+\noptional-form => constant-or-symbol+\n\ne.g. [width \"x\" height [\"+\" x \"+\" y] [special]]\n\nTODO:\n- implement pre and post conditions.\n- implement +options.",
   :var-type "macro",
   :line 55,
   :file "src/im4clj/defoptions.clj"}
  {:arglists ([attr-map & specs]),
   :name "defoptions",
   :namespace "im4clj.defoptions",
   :source-url
   "http://github.com/neatonk/im4clj/blob/15f8a1580a4d1b8de76963204aacbb88dd5abe5d/src/im4clj/defoptions.clj#L84",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/15f8a1580a4d1b8de76963204aacbb88dd5abe5d/src/im4clj/defoptions.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.defoptions-api.html#im4clj.defoptions/defoptions",
   :doc "Define a bunch of option-fn's with the given attributes.",
   :var-type "macro",
   :line 84,
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
  {:arglists ([]),
   :name "-adjoin",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-adjoin",
   :doc "join images into a single multi-image file",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([matrix]),
   :name "-affine",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-affine",
   :doc "drawing transform matrix",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([]),
   :name "-antialias",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-antialias",
   :doc "remove pixel aliasing",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([]),
   :name "-append",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-append",
   :doc "append a set of images",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([spec]),
   :name "-asc-cdl",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-asc-cdl",
   :doc "apply ASC CDL color transform",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([string]),
   :name "-authenticate",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-authenticate",
   :doc "decrypt image with this password",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([]),
   :name "-average",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-average",
   :doc "average a set of images",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([color]),
   :name "-background",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-background",
   :doc "the background color",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists
   ([red] [red green] [red green blue] [red green blue opacity]),
   :name "-black-threshold",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-black-threshold",
   :doc "pixels below the threshold become black",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([x y]),
   :name "-blue-primary",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-blue-primary",
   :doc "blue chromaticity primary point",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([radius] [radius sigma]),
   :name "-blur",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-blur",
   :doc "blur the image with a Gaussian operator",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([width height]),
   :name "-border",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-border",
   :doc "surround the image with a border of color",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([color]),
   :name "-bordercolor",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-bordercolor",
   :doc "the border color",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([color]),
   :name "-box",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-box",
   :doc "set the color of the annotation bounding box",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([type]),
   :name "-channel",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-channel",
   :doc "the type of channel",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([factor]),
   :name "-charcoal",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-charcoal",
   :doc "simulate a charcoal drawing",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists
   ([width height] [width height x y] [width height x y special]),
   :name "-chop",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-chop",
   :doc "remove pixels from the interior of an image",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([]),
   :name "-clip",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-clip",
   :doc "apply the clipping path, if one is present",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([]),
   :name "-coalesce",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-coalesce",
   :doc "merge a sequence of images",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([value]),
   :name "-colorize",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-colorize",
   :doc "colorize the image with the pen color",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([value]),
   :name "-colors",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-colors",
   :doc "preferred number of colors in the image",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([value]),
   :name "-colorspace",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-colorspace",
   :doc "the type of colorspace",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([string]),
   :name "-comment",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-comment",
   :doc "annotate an image with a comment",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([operator]),
   :name "-compose",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-compose",
   :doc "the type of image composition",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([type]),
   :name "-compress",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-compress",
   :doc "the type of image compression",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([]),
   :name "-contrast",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-contrast",
   :doc "enhance or reduce the image contrast",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([kernel]),
   :name "-convolve",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-convolve",
   :doc "convolve image with the specified convolution kernel",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists
   ([width height] [width height x y] [width height x y special]),
   :name "-crop",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-crop",
   :doc "preferred size and location of the cropped image",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([amount]),
   :name "-cycle",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-cycle",
   :doc "displace image colormap by amount",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([events]),
   :name "-debug",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-debug",
   :doc "enable debug printout",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([]),
   :name "-deconstruct",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-deconstruct",
   :doc "break down an image sequence into constituent parts",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([key] [key value]),
   :name "-define",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-define",
   :doc "add coder/decoder specific options",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([hundredths-of-a-second]),
   :name "-delay",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-delay",
   :doc "display the next image after pausing",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([width height]),
   :name "-density",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-density",
   :doc "horizontal and vertical resolution in pixels of the image",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([value]),
   :name "-depth",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-depth",
   :doc "depth of the image",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([]),
   :name "-despeckle",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-despeckle",
   :doc "reduce the speckles within an image",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([host display] [host display screen]),
   :name "-display",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-display",
   :doc "specifies the X server to contact",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([method]),
   :name "-dispose",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-dispose",
   :doc "GIF disposal method",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([]),
   :name "-dither",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-dither",
   :doc "apply Floyd/Steinberg error diffusion to the image",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([string]),
   :name "-draw",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-draw",
   :doc "annotate an image with one or more graphic primitives",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([radius]),
   :name "-edge",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-edge",
   :doc "detect edges within an image",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([radius]),
   :name "-emboss",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-emboss",
   :doc "emboss an image",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([type]),
   :name "-encoding",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-encoding",
   :doc "specify the text encoding",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([type]),
   :name "-endian",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-endian",
   :doc "specify endianness (MSB, LSB, or Native) of image",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([]),
   :name "-enhance",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-enhance",
   :doc "apply a digital filter to enhance a noisy image",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([]),
   :name "-equalize",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-equalize",
   :doc "perform histogram equalization to the image",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([width height] [width height x y]),
   :name "-extent",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-extent",
   :doc "composite image on background color canvas image",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([color]),
   :name "-fill",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-fill",
   :doc "color to use when filling a graphic primitive",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([type]),
   :name "-filter",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-filter",
   :doc "use this type of filter when resizing an image",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([]),
   :name "-flatten",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-flatten",
   :doc "flatten a sequence of images",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([]),
   :name "-flip",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-flip",
   :doc "create a \"mirror image\"",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([]),
   :name "-flop",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-flop",
   :doc "create a \"mirror image\"",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([name]),
   :name "-font",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-font",
   :doc "use this font when annotating the image with text",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([width height outer-bevel-width inner-bevel-width]),
   :name "-frame",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-frame",
   :doc "surround the image with an ornamental border",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([distance] [distance percent?]),
   :name "-fuzz",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-fuzz",
   :doc "colors within this Euclidean distance are considered equal",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([value]),
   :name "-gamma",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-gamma",
   :doc "level of gamma correction",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([radius] [radius sigma]),
   :name "-gaussian",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-gaussian",
   :doc "blur the image with a Gaussian operator",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists
   ([width height] [width height x y] [width height x y special]),
   :name "-geometry",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-geometry",
   :doc "preferred size and location of the Image window.",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([type]),
   :name "-gravity",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-gravity",
   :doc
   "direction primitive  gravitates to when annotating the image.",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([x y]),
   :name "-green-primary",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-green-primary",
   :doc "green chromaticity primary point",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([clut]),
   :name "-hald-clut",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-hald-clut",
   :doc "apply a Hald CLUT to the image",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([]),
   :name "-help",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-help",
   :doc "print usage instructions",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([factor]),
   :name "-implode",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-implode",
   :doc "implode image pixels about the center",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([type]),
   :name "-intent",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-intent",
   :doc
   "use this type of rendering intent when managing the image color",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([type]),
   :name "-interlace",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-interlace",
   :doc "the type of interlacing scheme",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([name]),
   :name "-label",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-label",
   :doc "assign a label to an image",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([width height offset] [width height offset percent?]),
   :name "-lat",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-lat",
   :doc "perform local adaptive thresholding",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists
   ([black-point]
    [black-point gamma]
    [black-point gamma white-point]
    [black-point gamma white-point percent?]),
   :name "-level",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-level",
   :doc "adjust the level of image contrast",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([type value]),
   :name "-limit",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L467",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-limit",
   :doc "Disk, File, Map, Memory, Pixels, or Threads resource limit",
   :var-type "function",
   :line 467,
   :file "src/im4clj/options.clj"}
  {:arglists ([type]),
   :name "-list",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-list",
   :doc "the type of list",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([string]),
   :name "-log",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-log",
   :doc "Specify format for debug log",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([iterations]),
   :name "-loop",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-loop",
   :doc "add Netscape loop extension to your GIF animation",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([]),
   :name "-magnify",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-magnify",
   :doc "magnify the image",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([filename]),
   :name "-map",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-map",
   :doc "choose a particular set of colors from this image",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([filename]),
   :name "-mask",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-mask",
   :doc "Specify a clipping mask",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([]),
   :name "-matte",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-matte",
   :doc "store matte channel if the image has one",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([color]),
   :name "-mattecolor",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-mattecolor",
   :doc "specify the color to be used with the -frame option",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([radius]),
   :name "-median",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-median",
   :doc "apply a median filter to the image",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([factor]),
   :name "-minify",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-minify",
   :doc "minify the image",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists
   ([brightness] [brightness saturation] [brightness saturation hue]),
   :name "-modulate",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-modulate",
   :doc "vary the brightness, saturation, and hue of an image",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([]),
   :name "-monitor",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-monitor",
   :doc "show progress indication",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([]),
   :name "-monochrome",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-monochrome",
   :doc "transform the image to black and white",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([frames]),
   :name "-morph",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-morph",
   :doc "morphs an image sequence",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([]),
   :name "-mosaic",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-mosaic",
   :doc "create a mosaic from an image or an image sequence",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([radius] [radius sigma] [radius sigma angle]),
   :name "-motion-blur",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-motion-blur",
   :doc "Simulate motion blur",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([]),
   :name "-negate",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-negate",
   :doc "replace every pixel with its complementary color",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([radius-or-type]),
   :name "-noise",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-noise",
   :doc "add or reduce noise in an image",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([]),
   :name "-noop",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-noop",
   :doc "NOOP (no option)",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([]),
   :name "-normalize",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-normalize",
   :doc "transform image to span the full range of color values",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([color]),
   :name "-opaque",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-opaque",
   :doc "change this color to the pen color within the image",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists
   ([channel operator rvalue] [channel operator rvalue percent?]),
   :name "-operator",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-operator",
   :doc
   "apply a mathematical, bitwise, or value operator to an image channel",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([channeltype n-by-n]),
   :name "-ordered-dither",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-ordered-dither",
   :doc "ordered dither the image",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists
   ([width height] [width height x y] [width height x y special]),
   :name "-page",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-page",
   :doc "size and location of an image canvas",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([radius]),
   :name "-paint",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-paint",
   :doc "simulate an oil painting",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([color]),
   :name "-pen",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-pen",
   :doc "(This option has been replaced by the -fill option)",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([]),
   :name "-ping",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-ping",
   :doc "efficiently determine image characteristics",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([value]),
   :name "-pointsize",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-pointsize",
   :doc "pointsize of the PostScript, X11, or TrueType font",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([type]),
   :name "-preview",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-preview",
   :doc "image preview type",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([command]),
   :name "-process",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-process",
   :doc "process a sequence of images using a process module",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([filename]),
   :name "-profile",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-profile",
   :doc "add ICM, IPTC, or generic profile  to image",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([value]),
   :name "-quality",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-quality",
   :doc "JPEG/MIFF/PNG/TIFF compression level",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([width height]),
   :name "-raise",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-raise",
   :doc "lighten or darken image edges",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([channeltype low-x-high]),
   :name "-random-threshold",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-random-threshold",
   :doc "random threshold the image",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([matrix]),
   :name "-recolor",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-recolor",
   :doc "apply a color translation matrix to image channels",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([x y]),
   :name "-red-primary",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-red-primary",
   :doc "red chromaticity primary point",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([width height] [width height x y]),
   :name "-region",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-region",
   :doc "apply options to a portion of the image",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([]),
   :name "-render",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-render",
   :doc "render vector operations",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([horizontal vertical]),
   :name "-resample",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-resample",
   :doc
   "Resample image to specified horizontal and vertical resolution",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([width height] [width height special]),
   :name "-resize",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-resize",
   :doc "resize an image",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([x y]),
   :name "-roll",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-roll",
   :doc "roll an image vertically or horizontally",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([degrees] [degrees special]),
   :name "-rotate",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-rotate",
   :doc "rotate the image",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([geometry]),
   :name "-sample",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-sample",
   :doc "scale image using pixel sampling",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([horizontal-factor vertical-factor]),
   :name "-sampling-factor",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-sampling-factor",
   :doc "chroma subsampling factors",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([geometry]),
   :name "-scale",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-scale",
   :doc "scale the image.",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([value]),
   :name "-scene",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-scene",
   :doc "set scene number",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([cluster-threshold smoothing-threshold]),
   :name "-segment",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-segment",
   :doc "segment an image",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([attribute] [attribute value]),
   :name "-set",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L472",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-set",
   :doc "set an image attribute",
   :var-type "function",
   :line 472,
   :file "src/im4clj/options.clj"}
  {:arglists ([azimuth elevation]),
   :name "-shade",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-shade",
   :doc "shade the image using a distant light source",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([radius] [radius sigma]),
   :name "-sharpen",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-sharpen",
   :doc "sharpen the image",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([width height] [width height percent?]),
   :name "-shave",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-shave",
   :doc "shave pixels from the image edges",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([x-degrees y-degrees]),
   :name "-shear",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-shear",
   :doc "shear the image along the X or Y axis",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([width height] [width height offset]),
   :name "-size",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-size",
   :doc "width and height of the image",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([factor]),
   :name "-solarize",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-solarize",
   :doc "negate all pixels above the threshold level",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([amount]),
   :name "-spread",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-spread",
   :doc "displace image pixels by a random amount",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([color]),
   :name "-stroke",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-stroke",
   :doc "color to use when stroking a graphic primitive",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([value]),
   :name "-strokewidth",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-strokewidth",
   :doc "set the stroke width",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([degrees]),
   :name "-swirl",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-swirl",
   :doc "swirl image pixels about the center",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([filename]),
   :name "-texture",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-texture",
   :doc "name of texture to tile onto the image background",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([value] [value percent?]),
   :name "-threshold",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-threshold",
   :doc "threshold the image",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([width height] [width height special]),
   :name "-thumbnail",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-thumbnail",
   :doc "resize an image (quickly)",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([filename]),
   :name "-tile",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-tile",
   :doc "tile image when filling a graphic primitive",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([]),
   :name "-transform",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-transform",
   :doc "transform the image",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([color]),
   :name "-transparent",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-transparent",
   :doc "make this color transparent within the image",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([value]),
   :name "-treedepth",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-treedepth",
   :doc "tree depth for the color reduction algorithm",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([]),
   :name "-trim",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-trim",
   :doc "trim an image",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([type]),
   :name "-type",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-type",
   :doc "the image type",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([type]),
   :name "-units",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-units",
   :doc "the units of image resolution",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists
   ([radius]
    [radius sigma]
    [radius sigma amount]
    [radius sigma amount threshold]),
   :name "-unsharp",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-unsharp",
   :doc "sharpen the image with an unsharp mask operator",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([]),
   :name "-use-pixmap",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-use-pixmap",
   :doc "use the pixmap",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([]),
   :name "-verbose",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-verbose",
   :doc "print detailed information about the image",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([]),
   :name "-version",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-version",
   :doc "print GraphicsMagick version string",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([string]),
   :name "-view",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-view",
   :doc "FlashPix viewing parameters",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([method]),
   :name "-virtual-pixel",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-virtual-pixel",
   :doc "specify contents of \"virtual pixels\"",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([amplitude wavelength]),
   :name "-wave",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-wave",
   :doc "alter an image along a sine wave",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([x y]),
   :name "-white-point",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-white-point",
   :doc "chromaticity white point",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists
   ([red] [red green] [red green blue] [red green blue opacity]),
   :name "-white-threshold",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-white-threshold",
   :doc "pixels above the threshold become white",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:arglists ([filename]),
   :name "-write",
   :namespace "im4clj.options",
   :source-url
   "http://github.com/neatonk/im4clj/blob/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/766998eea7bd955e70fe553832bb79d549c0828c/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/-write",
   :doc "write an intermediate image [convert, composite]",
   :var-type "function",
   :line 14,
   :file "src/im4clj/options.clj"}
  {:file "src/im4clj/run.clj",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/cecd3a636c2d704234ff01f2a178d15b67602a09/src/im4clj/run.clj",
   :source-url
   "http://github.com/neatonk/im4clj/blob/cecd3a636c2d704234ff01f2a178d15b67602a09/src/im4clj/run.clj#L14",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.run-api.html#im4clj.run/Stringifiable",
   :namespace "im4clj.run",
   :line 14,
   :var-type "var",
   :doc
   "Protocol to control the conversion of commandline components prior to execution.",
   :name "Stringifiable"}
  {:arglists ([cmd & opts]),
   :name "run",
   :namespace "im4clj.run",
   :source-url
   "http://github.com/neatonk/im4clj/blob/cecd3a636c2d704234ff01f2a178d15b67602a09/src/im4clj/run.clj#L45",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/cecd3a636c2d704234ff01f2a178d15b67602a09/src/im4clj/run.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.run-api.html#im4clj.run/run",
   :doc
   "Run a command by name with the given opts. Accepts any Stringifiable\n type.\n\n Prefer pre-defined commands e.g. im4clj.core/convert.\n\n Example Usage:\n\n (run :convert \"input.jpg\" '-resize 100 \"output.jpg\")\n",
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
   "http://github.com/neatonk/im4clj/blob/cecd3a636c2d704234ff01f2a178d15b67602a09/src/im4clj/run.clj#L38",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/cecd3a636c2d704234ff01f2a178d15b67602a09/src/im4clj/run.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.run-api.html#im4clj.run/stringify-all",
   :doc "Convert args to a flat sequence of strings.",
   :var-type "function",
   :line 38,
   :file "src/im4clj/run.clj"})}

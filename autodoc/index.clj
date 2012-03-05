{:namespaces
 ({:source-url
   "http://github.com/neatonk/im4clj/blob/d9cabf90938d11ce0846a1e5d9f6f05e2248cb70/src/im4clj/commands.clj",
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
   "http://github.com/neatonk/im4clj/blob/403c5356f49e74924f54cf684e033704689711ec/src/im4clj/core.clj",
   :wiki-url "http://neatonk.github.com/im4clj/im4clj.core-api.html",
   :name "im4clj.core",
   :author "Kevin Neaton",
   :doc "ImageMagick for Clojure."}
  {:source-url
   "http://github.com/neatonk/im4clj/blob/031d9655cc06c8c63eda27402d35e00f64eafbd5/src/im4clj/geometry.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj/im4clj.geometry-api.html",
   :name "im4clj.geometry",
   :author "Kevin Neaton",
   :doc
   "Functions used to generate and validate ImageMagick geometry spec strings."}
  {:source-url
   "http://github.com/neatonk/im4clj/blob/7ced1be7159b6ede72a17887aaeb2aee150ea215/src/im4clj/im4java.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj/im4clj.im4java-api.html",
   :name "im4clj.im4java",
   :author "Kevin Neaton",
   :doc
   "Wrapper functions and utils for running shell commands with im4java."}
  {:source-url
   "http://github.com/neatonk/im4clj/blob/9b81a1ed5d99a736b24dea215478893219564642/src/im4clj/magick.clj",
   :wiki-url "http://neatonk.github.com/im4clj/im4clj.magick-api.html",
   :name "im4clj.magick",
   :author "Kevin Neaton",
   :doc
   "ImageMagick for Clojure. im4clj.magick defines a single public... magick. Use magick to access all of im4clj's goodness without polluting our current namespace."}
  {:source-url
   "http://github.com/neatonk/im4clj/blob/d9cabf90938d11ce0846a1e5d9f6f05e2248cb70/src/im4clj/options.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj/im4clj.options-api.html",
   :name "im4clj.options",
   :author "Kevin Neaton",
   :doc "Namespace used to generate option fn's"}
  {:source-url
   "http://github.com/neatonk/im4clj/blob/403c5356f49e74924f54cf684e033704689711ec/src/im4clj/run.clj",
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
   "http://github.com/neatonk/im4clj/blob/403c5356f49e74924f54cf684e033704689711ec/src/im4clj/util/ns.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj/im4clj.util.ns-api.html",
   :name "im4clj.util.ns",
   :doc "Namespace utilities"}),
 :vars
 ({:file "src/im4clj/commands.clj",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/d9cabf90938d11ce0846a1e5d9f6f05e2248cb70/src/im4clj/commands.clj",
   :source-url nil,
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.commands-api.html#im4clj.commands/animate",
   :namespace "im4clj.commands",
   :var-type "function",
   :arglists ([& opts]),
   :doc
   "Run a animate command with the given options. See IM/GM documentation for usage.\n\nTODO: add example usage.",
   :name "animate"}
  {:arglists ([cmd]),
   :name "command",
   :namespace "im4clj.commands",
   :source-url
   "http://github.com/neatonk/im4clj/blob/d9cabf90938d11ce0846a1e5d9f6f05e2248cb70/src/im4clj/commands.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/d9cabf90938d11ce0846a1e5d9f6f05e2248cb70/src/im4clj/commands.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.commands-api.html#im4clj.commands/command",
   :doc
   "Build a new command. Prepends \"gm\" to the command if (use-gm?) is true.\n\n Example Usage:\n\n (command :convert)\n (command 'convert)\n (command \"convert\")\n",
   :var-type "function",
   :line 14,
   :file "src/im4clj/commands.clj"}
  {:file "src/im4clj/commands.clj",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/d9cabf90938d11ce0846a1e5d9f6f05e2248cb70/src/im4clj/commands.clj",
   :source-url nil,
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.commands-api.html#im4clj.commands/compare",
   :namespace "im4clj.commands",
   :var-type "function",
   :arglists ([& opts]),
   :doc
   "Run a compare command with the given options. See IM/GM documentation for usage.\n\nTODO: add example usage.",
   :name "compare"}
  {:file "src/im4clj/commands.clj",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/d9cabf90938d11ce0846a1e5d9f6f05e2248cb70/src/im4clj/commands.clj",
   :source-url nil,
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.commands-api.html#im4clj.commands/composite",
   :namespace "im4clj.commands",
   :var-type "function",
   :arglists ([& opts]),
   :doc
   "Run a composite command with the given options. See IM/GM documentation for usage.\n\nTODO: add example usage.",
   :name "composite"}
  {:file "src/im4clj/commands.clj",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/d9cabf90938d11ce0846a1e5d9f6f05e2248cb70/src/im4clj/commands.clj",
   :source-url nil,
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.commands-api.html#im4clj.commands/conjure",
   :namespace "im4clj.commands",
   :var-type "function",
   :arglists ([& opts]),
   :doc
   "Run a conjure command with the given options. See IM/GM documentation for usage.\n\nTODO: add example usage.",
   :name "conjure"}
  {:file "src/im4clj/commands.clj",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/d9cabf90938d11ce0846a1e5d9f6f05e2248cb70/src/im4clj/commands.clj",
   :source-url nil,
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.commands-api.html#im4clj.commands/convert",
   :namespace "im4clj.commands",
   :var-type "function",
   :arglists ([& opts]),
   :doc
   "Run a convert command with the given options. See IM/GM documentation for usage.\n\nExample Usage:\n\n(convert \"input.jpg\" (resize 640 480) \"output.jpg\")",
   :name "convert"}
  {:file "src/im4clj/commands.clj",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/d9cabf90938d11ce0846a1e5d9f6f05e2248cb70/src/im4clj/commands.clj",
   :source-url nil,
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.commands-api.html#im4clj.commands/display",
   :namespace "im4clj.commands",
   :var-type "function",
   :arglists ([& opts]),
   :doc
   "Run a display command with the given options. See IM/GM documentation for usage.\n\nTODO: add example usage.",
   :name "display"}
  {:file "src/im4clj/commands.clj",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/d9cabf90938d11ce0846a1e5d9f6f05e2248cb70/src/im4clj/commands.clj",
   :source-url nil,
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.commands-api.html#im4clj.commands/identify",
   :namespace "im4clj.commands",
   :var-type "function",
   :arglists ([& opts]),
   :doc
   "Run a identify command with the given options. See IM/GM documentation for usage.\n\nTODO: add example usage.",
   :name "identify"}
  {:file "src/im4clj/commands.clj",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/d9cabf90938d11ce0846a1e5d9f6f05e2248cb70/src/im4clj/commands.clj",
   :source-url nil,
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.commands-api.html#im4clj.commands/import",
   :namespace "im4clj.commands",
   :var-type "function",
   :arglists ([& opts]),
   :doc
   "Run a import command with the given options. See IM/GM documentation for usage.\n\nTODO: add example usage.",
   :name "import"}
  {:file "src/im4clj/commands.clj",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/d9cabf90938d11ce0846a1e5d9f6f05e2248cb70/src/im4clj/commands.clj",
   :source-url nil,
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.commands-api.html#im4clj.commands/mogrify",
   :namespace "im4clj.commands",
   :var-type "function",
   :arglists ([& opts]),
   :doc
   "Run a mogrify command with the given options. See IM/GM documentation for usage.\n\nTODO: add example usage.",
   :name "mogrify"}
  {:file "src/im4clj/commands.clj",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/d9cabf90938d11ce0846a1e5d9f6f05e2248cb70/src/im4clj/commands.clj",
   :source-url nil,
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.commands-api.html#im4clj.commands/montage",
   :namespace "im4clj.commands",
   :var-type "function",
   :arglists ([& opts]),
   :doc
   "Run a montage command with the given options. See IM/GM documentation for usage.\n\nTODO: add example usage.",
   :name "montage"}
  {:file "src/im4clj/commands.clj",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/d9cabf90938d11ce0846a1e5d9f6f05e2248cb70/src/im4clj/commands.clj",
   :source-url nil,
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.commands-api.html#im4clj.commands/stream",
   :namespace "im4clj.commands",
   :var-type "function",
   :arglists ([& opts]),
   :doc
   "Run a stream command with the given options. See IM/GM documentation for usage.\n\nTODO: add example usage.\n\nImageMagick only.",
   :name "stream"}
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
  {:file "src/im4clj/commands.clj",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/d9cabf90938d11ce0846a1e5d9f6f05e2248cb70/src/im4clj/commands.clj",
   :source-url nil,
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/animate",
   :namespace "im4clj.core",
   :var-type "function",
   :arglists ([& opts]),
   :doc
   "Run a animate command with the given options. See IM/GM documentation for usage.\n\nTODO: add example usage.",
   :name "animate"}
  {:file "src/im4clj/options.clj",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/d9cabf90938d11ce0846a1e5d9f6f05e2248cb70/src/im4clj/options.clj",
   :source-url nil,
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/border",
   :namespace "im4clj.core",
   :var-type "function",
   :arglists ([width height]),
   :doc
   "Creates a new border option for use in a command. See IM/GM documentation for usage.\n\nTODO: add docstring.",
   :name "border"}
  {:file "src/im4clj/options.clj",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/d9cabf90938d11ce0846a1e5d9f6f05e2248cb70/src/im4clj/options.clj",
   :source-url nil,
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/bordercolor",
   :namespace "im4clj.core",
   :var-type "function",
   :arglists ([color]),
   :doc
   "Creates a new bordercolor option for use in a command. See IM/GM documentation for usage.\n\nTODO: add docstring.",
   :name "bordercolor"}
  {:file "src/im4clj/options.clj",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/d9cabf90938d11ce0846a1e5d9f6f05e2248cb70/src/im4clj/options.clj",
   :source-url nil,
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/borderwidth",
   :namespace "im4clj.core",
   :var-type "function",
   :arglists ([width height [offset-x offset-y] ? special?]),
   :doc
   "Creates a new borderwidth option for use in a command. See IM/GM documentation for usage.\n\nTODO: add docstring.",
   :name "borderwidth"}
  {:file "src/im4clj/options.clj",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/d9cabf90938d11ce0846a1e5d9f6f05e2248cb70/src/im4clj/options.clj",
   :source-url nil,
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/colorspace",
   :namespace "im4clj.core",
   :var-type "function",
   :arglists ([value]),
   :doc
   "Creates a new colorspace option for use in a command. See IM/GM documentation for usage.\n\nTODO: add docstring.",
   :name "colorspace"}
  {:arglists ([cmd]),
   :name "command",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/d9cabf90938d11ce0846a1e5d9f6f05e2248cb70/src/im4clj/commands.clj#L14",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/d9cabf90938d11ce0846a1e5d9f6f05e2248cb70/src/im4clj/commands.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/command",
   :doc
   "Build a new command. Prepends \"gm\" to the command if (use-gm?) is true.\n\n Example Usage:\n\n (command :convert)\n (command 'convert)\n (command \"convert\")\n",
   :var-type "function",
   :line 14,
   :file "src/im4clj/commands.clj"}
  {:file "src/im4clj/commands.clj",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/d9cabf90938d11ce0846a1e5d9f6f05e2248cb70/src/im4clj/commands.clj",
   :source-url nil,
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/compare",
   :namespace "im4clj.core",
   :var-type "function",
   :arglists ([& opts]),
   :doc
   "Run a compare command with the given options. See IM/GM documentation for usage.\n\nTODO: add example usage.",
   :name "compare"}
  {:file "src/im4clj/commands.clj",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/d9cabf90938d11ce0846a1e5d9f6f05e2248cb70/src/im4clj/commands.clj",
   :source-url nil,
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/composite",
   :namespace "im4clj.core",
   :var-type "function",
   :arglists ([& opts]),
   :doc
   "Run a composite command with the given options. See IM/GM documentation for usage.\n\nTODO: add example usage.",
   :name "composite"}
  {:file "src/im4clj/commands.clj",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/d9cabf90938d11ce0846a1e5d9f6f05e2248cb70/src/im4clj/commands.clj",
   :source-url nil,
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/conjure",
   :namespace "im4clj.core",
   :var-type "function",
   :arglists ([& opts]),
   :doc
   "Run a conjure command with the given options. See IM/GM documentation for usage.\n\nTODO: add example usage.",
   :name "conjure"}
  {:file "src/im4clj/options.clj",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/d9cabf90938d11ce0846a1e5d9f6f05e2248cb70/src/im4clj/options.clj",
   :source-url nil,
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/contrast",
   :namespace "im4clj.core",
   :var-type "function",
   :arglists ([]),
   :doc
   "Creates a new contrast option for use in a command. See IM/GM documentation for usage.\n\nTODO: add docstring.",
   :name "contrast"}
  {:file "src/im4clj/commands.clj",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/d9cabf90938d11ce0846a1e5d9f6f05e2248cb70/src/im4clj/commands.clj",
   :source-url nil,
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/convert",
   :namespace "im4clj.core",
   :var-type "function",
   :arglists ([& opts]),
   :doc
   "Run a convert command with the given options. See IM/GM documentation for usage.\n\nExample Usage:\n\n(convert \"input.jpg\" (resize 640 480) \"output.jpg\")",
   :name "convert"}
  {:file "src/im4clj/options.clj",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/d9cabf90938d11ce0846a1e5d9f6f05e2248cb70/src/im4clj/options.clj",
   :source-url nil,
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/crop",
   :namespace "im4clj.core",
   :var-type "function",
   :arglists ([width height [offset-x offset-y] ? special?]),
   :doc
   "Creates a new crop option for use in a command. See IM/GM documentation for usage.\n\nTODO: add docstring.",
   :name "crop"}
  {:file "src/im4clj/options.clj",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/d9cabf90938d11ce0846a1e5d9f6f05e2248cb70/src/im4clj/options.clj",
   :source-url nil,
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/define",
   :namespace "im4clj.core",
   :var-type "function",
   :arglists ([key] [key value]),
   :doc
   "Creates a new define option for use in a command. See IM/GM documentation for usage.\n\nTODO: add docstring.",
   :name "define"}
  {:file "src/im4clj/options.clj",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/d9cabf90938d11ce0846a1e5d9f6f05e2248cb70/src/im4clj/options.clj",
   :source-url nil,
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/depth",
   :namespace "im4clj.core",
   :var-type "function",
   :arglists ([value]),
   :doc
   "Creates a new depth option for use in a command. See IM/GM documentation for usage.\n\nTODO: add docstring.",
   :name "depth"}
  {:file "src/im4clj/commands.clj",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/d9cabf90938d11ce0846a1e5d9f6f05e2248cb70/src/im4clj/commands.clj",
   :source-url nil,
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/display",
   :namespace "im4clj.core",
   :var-type "function",
   :arglists ([& opts]),
   :doc
   "Run a display command with the given options. See IM/GM documentation for usage.\n\nTODO: add example usage.",
   :name "display"}
  {:file "src/im4clj/options.clj",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/d9cabf90938d11ce0846a1e5d9f6f05e2248cb70/src/im4clj/options.clj",
   :source-url nil,
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/draw",
   :namespace "im4clj.core",
   :var-type "function",
   :arglists ([string]),
   :doc
   "Creates a new draw option for use in a command. See IM/GM documentation for usage.\n\nTODO: add docstring.",
   :name "draw"}
  {:file "src/im4clj/options.clj",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/d9cabf90938d11ce0846a1e5d9f6f05e2248cb70/src/im4clj/options.clj",
   :source-url nil,
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/flip",
   :namespace "im4clj.core",
   :var-type "function",
   :arglists ([]),
   :doc
   "Creates a new flip option for use in a command. See IM/GM documentation for usage.\n\nTODO: add docstring.",
   :name "flip"}
  {:file "src/im4clj/options.clj",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/d9cabf90938d11ce0846a1e5d9f6f05e2248cb70/src/im4clj/options.clj",
   :source-url nil,
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/flop",
   :namespace "im4clj.core",
   :var-type "function",
   :arglists ([]),
   :doc
   "Creates a new flop option for use in a command. See IM/GM documentation for usage.\n\nTODO: add docstring.",
   :name "flop"}
  {:file "src/im4clj/options.clj",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/d9cabf90938d11ce0846a1e5d9f6f05e2248cb70/src/im4clj/options.clj",
   :source-url nil,
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/font",
   :namespace "im4clj.core",
   :var-type "function",
   :arglists ([name]),
   :doc
   "Creates a new font option for use in a command. See IM/GM documentation for usage.\n\nTODO: add docstring.",
   :name "font"}
  {:file "src/im4clj/options.clj",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/d9cabf90938d11ce0846a1e5d9f6f05e2248cb70/src/im4clj/options.clj",
   :source-url nil,
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/gaussian",
   :namespace "im4clj.core",
   :var-type "function",
   :arglists ([radius] [radius sigma]),
   :doc
   "Creates a new gaussian option for use in a command. See IM/GM documentation for usage.\n\nTODO: add docstring.",
   :name "gaussian"}
  {:file "src/im4clj/commands.clj",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/d9cabf90938d11ce0846a1e5d9f6f05e2248cb70/src/im4clj/commands.clj",
   :source-url nil,
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/identify",
   :namespace "im4clj.core",
   :var-type "function",
   :arglists ([& opts]),
   :doc
   "Run a identify command with the given options. See IM/GM documentation for usage.\n\nTODO: add example usage.",
   :name "identify"}
  {:file "src/im4clj/commands.clj",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/d9cabf90938d11ce0846a1e5d9f6f05e2248cb70/src/im4clj/commands.clj",
   :source-url nil,
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/import",
   :namespace "im4clj.core",
   :var-type "function",
   :arglists ([& opts]),
   :doc
   "Run a import command with the given options. See IM/GM documentation for usage.\n\nTODO: add example usage.",
   :name "import"}
  {:file "src/im4clj/options.clj",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/d9cabf90938d11ce0846a1e5d9f6f05e2248cb70/src/im4clj/options.clj",
   :source-url nil,
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/intent",
   :namespace "im4clj.core",
   :var-type "function",
   :arglists ([type]),
   :doc
   "Creates a new intent option for use in a command. See IM/GM documentation for usage.\n\nTODO: add docstring.",
   :name "intent"}
  {:file "src/im4clj/options.clj",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/d9cabf90938d11ce0846a1e5d9f6f05e2248cb70/src/im4clj/options.clj",
   :source-url nil,
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/limit",
   :namespace "im4clj.core",
   :var-type "function",
   :arglists ([type value]),
   :doc
   "Creates a new limit option for use in a command. See IM/GM documentation for usage.\n\nTODO: add docstring.",
   :name "limit"}
  {:file "src/im4clj/commands.clj",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/d9cabf90938d11ce0846a1e5d9f6f05e2248cb70/src/im4clj/commands.clj",
   :source-url nil,
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/mogrify",
   :namespace "im4clj.core",
   :var-type "function",
   :arglists ([& opts]),
   :doc
   "Run a mogrify command with the given options. See IM/GM documentation for usage.\n\nTODO: add example usage.",
   :name "mogrify"}
  {:file "src/im4clj/commands.clj",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/d9cabf90938d11ce0846a1e5d9f6f05e2248cb70/src/im4clj/commands.clj",
   :source-url nil,
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/montage",
   :namespace "im4clj.core",
   :var-type "function",
   :arglists ([& opts]),
   :doc
   "Run a montage command with the given options. See IM/GM documentation for usage.\n\nTODO: add example usage.",
   :name "montage"}
  {:file "src/im4clj/options.clj",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/d9cabf90938d11ce0846a1e5d9f6f05e2248cb70/src/im4clj/options.clj",
   :source-url nil,
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/quality",
   :namespace "im4clj.core",
   :var-type "function",
   :arglists ([value]),
   :doc
   "Creates a new quality option for use in a command. See IM/GM documentation for usage.\n\nTODO: add docstring.",
   :name "quality"}
  {:file "src/im4clj/options.clj",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/d9cabf90938d11ce0846a1e5d9f6f05e2248cb70/src/im4clj/options.clj",
   :source-url nil,
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/resize",
   :namespace "im4clj.core",
   :var-type "function",
   :arglists ([width] [width height]),
   :doc
   "Creates a new resize option for use in a command. See IM/GM documentation for usage.\n\nresize an image.",
   :name "resize"}
  {:file "src/im4clj/options.clj",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/d9cabf90938d11ce0846a1e5d9f6f05e2248cb70/src/im4clj/options.clj",
   :source-url nil,
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/rotate",
   :namespace "im4clj.core",
   :var-type "function",
   :arglists ([degrees]),
   :doc
   "Creates a new rotate option for use in a command. See IM/GM documentation for usage.\n\nTODO: add docstring.",
   :name "rotate"}
  {:arglists ([cmd & opts]),
   :name "run",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/403c5356f49e74924f54cf684e033704689711ec/src/im4clj/run.clj#L32",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/403c5356f49e74924f54cf684e033704689711ec/src/im4clj/run.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/run",
   :doc
   "Run a command by name with the given opts. Accepts any 'stringify-able'\n type. Does not check (use-gm?).\n\n Prefer pre-defined commands e.g. im4clj.core/convert.\n\n Example Usage:\n\n (run :convert \"input.jpg\" :resize 100 \"output.jpg\")\n (run [:gm :convert] \"input.jpg\" :resize 100 \"output.jpg\")\n",
   :var-type "function",
   :line 32,
   :file "src/im4clj/run.clj"}
  {:file "src/im4clj/options.clj",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/d9cabf90938d11ce0846a1e5d9f6f05e2248cb70/src/im4clj/options.clj",
   :source-url nil,
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/sharpen",
   :namespace "im4clj.core",
   :var-type "function",
   :arglists ([radius] [radius sigma]),
   :doc
   "Creates a new sharpen option for use in a command. See IM/GM documentation for usage.\n\nTODO: add docstring.",
   :name "sharpen"}
  {:file "src/im4clj/commands.clj",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/d9cabf90938d11ce0846a1e5d9f6f05e2248cb70/src/im4clj/commands.clj",
   :source-url nil,
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/stream",
   :namespace "im4clj.core",
   :var-type "function",
   :arglists ([& opts]),
   :doc
   "Run a stream command with the given options. See IM/GM documentation for usage.\n\nTODO: add example usage.\n\nImageMagick only.",
   :name "stream"}
  {:arglists ([& args]),
   :name "stringify",
   :namespace "im4clj.core",
   :source-url
   "http://github.com/neatonk/im4clj/blob/403c5356f49e74924f54cf684e033704689711ec/src/im4clj/run.clj#L22",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/403c5356f49e74924f54cf684e033704689711ec/src/im4clj/run.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/stringify",
   :doc
   "Convert args to a flat sequence of strings.\n\nTODO: define stringify method for core types and move flatten to appropriate\nmethods.",
   :var-type "function",
   :line 22,
   :file "src/im4clj/run.clj"}
  {:file "src/im4clj/run.clj",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/403c5356f49e74924f54cf684e033704689711ec/src/im4clj/run.clj",
   :source-url
   "http://github.com/neatonk/im4clj/blob/403c5356f49e74924f54cf684e033704689711ec/src/im4clj/run.clj#L14",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/stringify-method",
   :namespace "im4clj.core",
   :line 14,
   :var-type "var",
   :doc "Method used by im4clj.core/stringify.",
   :name "stringify-method"}
  {:file "src/im4clj/options.clj",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/d9cabf90938d11ce0846a1e5d9f6f05e2248cb70/src/im4clj/options.clj",
   :source-url nil,
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/text-font",
   :namespace "im4clj.core",
   :var-type "function",
   :arglists ([name]),
   :doc
   "Creates a new text-font option for use in a command. See IM/GM documentation for usage.\n\nTODO: add docstring.",
   :name "text-font"}
  {:file "src/im4clj/options.clj",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/d9cabf90938d11ce0846a1e5d9f6f05e2248cb70/src/im4clj/options.clj",
   :source-url nil,
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.core-api.html#im4clj.core/unsharp",
   :namespace "im4clj.core",
   :var-type "function",
   :arglists ([]),
   :doc
   "Creates a new unsharp option for use in a command. See IM/GM documentation for usage.\n\nTODO: add docstring.",
   :name "unsharp"}
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
  {:arglists ([w] [w h] [w h s] [w h x y] [w h x y s]),
   :name "geometry-spec",
   :namespace "im4clj.geometry",
   :source-url
   "http://github.com/neatonk/im4clj/blob/031d9655cc06c8c63eda27402d35e00f64eafbd5/src/im4clj/geometry.clj#L56",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/031d9655cc06c8c63eda27402d35e00f64eafbd5/src/im4clj/geometry.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.geometry-api.html#im4clj.geometry/geometry-spec",
   :doc "Image size and offset.",
   :var-type "function",
   :line 56,
   :file "src/im4clj/geometry.clj"}
  {:arglists ([x y]),
   :name "offset",
   :namespace "im4clj.geometry",
   :source-url
   "http://github.com/neatonk/im4clj/blob/031d9655cc06c8c63eda27402d35e00f64eafbd5/src/im4clj/geometry.clj#L28",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/031d9655cc06c8c63eda27402d35e00f64eafbd5/src/im4clj/geometry.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.geometry-api.html#im4clj.geometry/offset",
   :doc "Specify the image offset in pixels from top left.",
   :var-type "function",
   :line 28,
   :file "src/im4clj/geometry.clj"}
  {:arglists ([n]),
   :name "signed-string",
   :namespace "im4clj.geometry",
   :source-url
   "http://github.com/neatonk/im4clj/blob/031d9655cc06c8c63eda27402d35e00f64eafbd5/src/im4clj/geometry.clj#L13",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/031d9655cc06c8c63eda27402d35e00f64eafbd5/src/im4clj/geometry.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.geometry-api.html#im4clj.geometry/signed-string",
   :doc "Converts an integer to a signed string.",
   :var-type "function",
   :line 13,
   :file "src/im4clj/geometry.clj"}
  {:arglists ([w] [w h] [w h s]),
   :name "size",
   :namespace "im4clj.geometry",
   :source-url
   "http://github.com/neatonk/im4clj/blob/031d9655cc06c8c63eda27402d35e00f64eafbd5/src/im4clj/geometry.clj#L22",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/031d9655cc06c8c63eda27402d35e00f64eafbd5/src/im4clj/geometry.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.geometry-api.html#im4clj.geometry/size",
   :doc "Specify the image width and height in pixels or percentages.",
   :var-type "function",
   :line 22,
   :file "src/im4clj/geometry.clj"}
  {:arglists ([c]),
   :name "special-char?",
   :namespace "im4clj.geometry",
   :source-url
   "http://github.com/neatonk/im4clj/blob/031d9655cc06c8c63eda27402d35e00f64eafbd5/src/im4clj/geometry.clj#L37",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/031d9655cc06c8c63eda27402d35e00f64eafbd5/src/im4clj/geometry.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.geometry-api.html#im4clj.geometry/special-char?",
   :doc
   "Predicate. Determines whether or not 'c' is a special character, or a string\nbegining with a special character. :see-also special-chars.",
   :var-type "function",
   :line 37,
   :file "src/im4clj/geometry.clj"}
  {:file "src/im4clj/geometry.clj",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/031d9655cc06c8c63eda27402d35e00f64eafbd5/src/im4clj/geometry.clj",
   :source-url
   "http://github.com/neatonk/im4clj/blob/031d9655cc06c8c63eda27402d35e00f64eafbd5/src/im4clj/geometry.clj#L34",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.geometry-api.html#im4clj.geometry/special-chars",
   :namespace "im4clj.geometry",
   :line 34,
   :var-type "var",
   :doc
   "Special characters used to modify the meaning of a geometry-spec.",
   :name "special-chars"}
  {:arglists ([s]),
   :name "valid-geometry-spec?",
   :namespace "im4clj.geometry",
   :source-url
   "http://github.com/neatonk/im4clj/blob/031d9655cc06c8c63eda27402d35e00f64eafbd5/src/im4clj/geometry.clj#L51",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/031d9655cc06c8c63eda27402d35e00f64eafbd5/src/im4clj/geometry.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.geometry-api.html#im4clj.geometry/valid-geometry-spec?",
   :doc
   "Predicate. Returns true if 's' is a properly formed geometry-spec string.",
   :var-type "function",
   :line 51,
   :file "src/im4clj/geometry.clj"}
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
  {:arglists ([& body]),
   :name "magick",
   :namespace "im4clj.magick",
   :source-url
   "http://github.com/neatonk/im4clj/blob/9b81a1ed5d99a736b24dea215478893219564642/src/im4clj/magick.clj#L20",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/9b81a1ed5d99a736b24dea215478893219564642/src/im4clj/magick.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.magick-api.html#im4clj.magick/magick",
   :doc
   "Access to all of im4clj's goodness without polluting our current namespace.\n\n Example Usage:\n\n (magick (convert input-path (resize 100) output-path))\n",
   :var-type "macro",
   :line 20,
   :file "src/im4clj/magick.clj"}
  {:file "src/im4clj/options.clj",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/d9cabf90938d11ce0846a1e5d9f6f05e2248cb70/src/im4clj/options.clj",
   :source-url nil,
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/border",
   :namespace "im4clj.options",
   :var-type "function",
   :arglists ([width height]),
   :doc
   "Creates a new border option for use in a command. See IM/GM documentation for usage.\n\nTODO: add docstring.",
   :name "border"}
  {:file "src/im4clj/options.clj",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/d9cabf90938d11ce0846a1e5d9f6f05e2248cb70/src/im4clj/options.clj",
   :source-url nil,
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/bordercolor",
   :namespace "im4clj.options",
   :var-type "function",
   :arglists ([color]),
   :doc
   "Creates a new bordercolor option for use in a command. See IM/GM documentation for usage.\n\nTODO: add docstring.",
   :name "bordercolor"}
  {:file "src/im4clj/options.clj",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/d9cabf90938d11ce0846a1e5d9f6f05e2248cb70/src/im4clj/options.clj",
   :source-url nil,
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/borderwidth",
   :namespace "im4clj.options",
   :var-type "function",
   :arglists ([width height [offset-x offset-y] ? special?]),
   :doc
   "Creates a new borderwidth option for use in a command. See IM/GM documentation for usage.\n\nTODO: add docstring.",
   :name "borderwidth"}
  {:file "src/im4clj/options.clj",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/d9cabf90938d11ce0846a1e5d9f6f05e2248cb70/src/im4clj/options.clj",
   :source-url nil,
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/colorspace",
   :namespace "im4clj.options",
   :var-type "function",
   :arglists ([value]),
   :doc
   "Creates a new colorspace option for use in a command. See IM/GM documentation for usage.\n\nTODO: add docstring.",
   :name "colorspace"}
  {:file "src/im4clj/options.clj",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/d9cabf90938d11ce0846a1e5d9f6f05e2248cb70/src/im4clj/options.clj",
   :source-url nil,
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/contrast",
   :namespace "im4clj.options",
   :var-type "function",
   :arglists ([]),
   :doc
   "Creates a new contrast option for use in a command. See IM/GM documentation for usage.\n\nTODO: add docstring.",
   :name "contrast"}
  {:file "src/im4clj/options.clj",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/d9cabf90938d11ce0846a1e5d9f6f05e2248cb70/src/im4clj/options.clj",
   :source-url nil,
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/crop",
   :namespace "im4clj.options",
   :var-type "function",
   :arglists ([width height [offset-x offset-y] ? special?]),
   :doc
   "Creates a new crop option for use in a command. See IM/GM documentation for usage.\n\nTODO: add docstring.",
   :name "crop"}
  {:file "src/im4clj/options.clj",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/d9cabf90938d11ce0846a1e5d9f6f05e2248cb70/src/im4clj/options.clj",
   :source-url nil,
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/define",
   :namespace "im4clj.options",
   :var-type "function",
   :arglists ([key] [key value]),
   :doc
   "Creates a new define option for use in a command. See IM/GM documentation for usage.\n\nTODO: add docstring.",
   :name "define"}
  {:file "src/im4clj/options.clj",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/d9cabf90938d11ce0846a1e5d9f6f05e2248cb70/src/im4clj/options.clj",
   :source-url nil,
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/depth",
   :namespace "im4clj.options",
   :var-type "function",
   :arglists ([value]),
   :doc
   "Creates a new depth option for use in a command. See IM/GM documentation for usage.\n\nTODO: add docstring.",
   :name "depth"}
  {:file "src/im4clj/options.clj",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/d9cabf90938d11ce0846a1e5d9f6f05e2248cb70/src/im4clj/options.clj",
   :source-url nil,
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/draw",
   :namespace "im4clj.options",
   :var-type "function",
   :arglists ([string]),
   :doc
   "Creates a new draw option for use in a command. See IM/GM documentation for usage.\n\nTODO: add docstring.",
   :name "draw"}
  {:file "src/im4clj/options.clj",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/d9cabf90938d11ce0846a1e5d9f6f05e2248cb70/src/im4clj/options.clj",
   :source-url nil,
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/flip",
   :namespace "im4clj.options",
   :var-type "function",
   :arglists ([]),
   :doc
   "Creates a new flip option for use in a command. See IM/GM documentation for usage.\n\nTODO: add docstring.",
   :name "flip"}
  {:file "src/im4clj/options.clj",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/d9cabf90938d11ce0846a1e5d9f6f05e2248cb70/src/im4clj/options.clj",
   :source-url nil,
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/flop",
   :namespace "im4clj.options",
   :var-type "function",
   :arglists ([]),
   :doc
   "Creates a new flop option for use in a command. See IM/GM documentation for usage.\n\nTODO: add docstring.",
   :name "flop"}
  {:file "src/im4clj/options.clj",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/d9cabf90938d11ce0846a1e5d9f6f05e2248cb70/src/im4clj/options.clj",
   :source-url nil,
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/font",
   :namespace "im4clj.options",
   :var-type "function",
   :arglists ([name]),
   :doc
   "Creates a new font option for use in a command. See IM/GM documentation for usage.\n\nTODO: add docstring.",
   :name "font"}
  {:file "src/im4clj/options.clj",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/d9cabf90938d11ce0846a1e5d9f6f05e2248cb70/src/im4clj/options.clj",
   :source-url nil,
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/gaussian",
   :namespace "im4clj.options",
   :var-type "function",
   :arglists ([radius] [radius sigma]),
   :doc
   "Creates a new gaussian option for use in a command. See IM/GM documentation for usage.\n\nTODO: add docstring.",
   :name "gaussian"}
  {:file "src/im4clj/options.clj",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/d9cabf90938d11ce0846a1e5d9f6f05e2248cb70/src/im4clj/options.clj",
   :source-url nil,
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/intent",
   :namespace "im4clj.options",
   :var-type "function",
   :arglists ([type]),
   :doc
   "Creates a new intent option for use in a command. See IM/GM documentation for usage.\n\nTODO: add docstring.",
   :name "intent"}
  {:file "src/im4clj/options.clj",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/d9cabf90938d11ce0846a1e5d9f6f05e2248cb70/src/im4clj/options.clj",
   :source-url nil,
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/limit",
   :namespace "im4clj.options",
   :var-type "function",
   :arglists ([type value]),
   :doc
   "Creates a new limit option for use in a command. See IM/GM documentation for usage.\n\nTODO: add docstring.",
   :name "limit"}
  {:file "src/im4clj/options.clj",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/d9cabf90938d11ce0846a1e5d9f6f05e2248cb70/src/im4clj/options.clj",
   :source-url nil,
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/quality",
   :namespace "im4clj.options",
   :var-type "function",
   :arglists ([value]),
   :doc
   "Creates a new quality option for use in a command. See IM/GM documentation for usage.\n\nTODO: add docstring.",
   :name "quality"}
  {:file "src/im4clj/options.clj",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/d9cabf90938d11ce0846a1e5d9f6f05e2248cb70/src/im4clj/options.clj",
   :source-url nil,
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/resize",
   :namespace "im4clj.options",
   :var-type "function",
   :arglists ([width] [width height]),
   :doc
   "Creates a new resize option for use in a command. See IM/GM documentation for usage.\n\nresize an image.",
   :name "resize"}
  {:file "src/im4clj/options.clj",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/d9cabf90938d11ce0846a1e5d9f6f05e2248cb70/src/im4clj/options.clj",
   :source-url nil,
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/rotate",
   :namespace "im4clj.options",
   :var-type "function",
   :arglists ([degrees]),
   :doc
   "Creates a new rotate option for use in a command. See IM/GM documentation for usage.\n\nTODO: add docstring.",
   :name "rotate"}
  {:file "src/im4clj/options.clj",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/d9cabf90938d11ce0846a1e5d9f6f05e2248cb70/src/im4clj/options.clj",
   :source-url nil,
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/sharpen",
   :namespace "im4clj.options",
   :var-type "function",
   :arglists ([radius] [radius sigma]),
   :doc
   "Creates a new sharpen option for use in a command. See IM/GM documentation for usage.\n\nTODO: add docstring.",
   :name "sharpen"}
  {:file "src/im4clj/options.clj",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/d9cabf90938d11ce0846a1e5d9f6f05e2248cb70/src/im4clj/options.clj",
   :source-url nil,
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/text-font",
   :namespace "im4clj.options",
   :var-type "function",
   :arglists ([name]),
   :doc
   "Creates a new text-font option for use in a command. See IM/GM documentation for usage.\n\nTODO: add docstring.",
   :name "text-font"}
  {:file "src/im4clj/options.clj",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/d9cabf90938d11ce0846a1e5d9f6f05e2248cb70/src/im4clj/options.clj",
   :source-url nil,
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.options-api.html#im4clj.options/unsharp",
   :namespace "im4clj.options",
   :var-type "function",
   :arglists ([]),
   :doc
   "Creates a new unsharp option for use in a command. See IM/GM documentation for usage.\n\nTODO: add docstring.",
   :name "unsharp"}
  {:arglists ([cmd & opts]),
   :name "run",
   :namespace "im4clj.run",
   :source-url
   "http://github.com/neatonk/im4clj/blob/403c5356f49e74924f54cf684e033704689711ec/src/im4clj/run.clj#L32",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/403c5356f49e74924f54cf684e033704689711ec/src/im4clj/run.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.run-api.html#im4clj.run/run",
   :doc
   "Run a command by name with the given opts. Accepts any 'stringify-able'\n type. Does not check (use-gm?).\n\n Prefer pre-defined commands e.g. im4clj.core/convert.\n\n Example Usage:\n\n (run :convert \"input.jpg\" :resize 100 \"output.jpg\")\n (run [:gm :convert] \"input.jpg\" :resize 100 \"output.jpg\")\n",
   :var-type "function",
   :line 32,
   :file "src/im4clj/run.clj"}
  {:arglists ([& args]),
   :name "stringify",
   :namespace "im4clj.run",
   :source-url
   "http://github.com/neatonk/im4clj/blob/403c5356f49e74924f54cf684e033704689711ec/src/im4clj/run.clj#L22",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/403c5356f49e74924f54cf684e033704689711ec/src/im4clj/run.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.run-api.html#im4clj.run/stringify",
   :doc
   "Convert args to a flat sequence of strings.\n\nTODO: define stringify method for core types and move flatten to appropriate\nmethods.",
   :var-type "function",
   :line 22,
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
   "http://github.com/neatonk/im4clj/blob/403c5356f49e74924f54cf684e033704689711ec/src/im4clj/util/ns.clj#L4",
   :raw-source-url
   "http://github.com/neatonk/im4clj/raw/403c5356f49e74924f54cf684e033704689711ec/src/im4clj/util/ns.clj",
   :wiki-url
   "http://neatonk.github.com/im4clj//im4clj.util.ns-api.html#im4clj.util.ns/immigrate",
   :doc
   "Create a public var in this namespace for each public var in the\nnamespaces named by ns-names. The created vars have the same name, value\nand metadata as the original except that their :ns metadata value is this\nnamespace.",
   :var-type "function",
   :line 4,
   :file "src/im4clj/util/ns.clj"})}

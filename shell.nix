with import <nixpkgs> {};
pkgs.mkShell rec {
  buildInputs = with pkgs; [ gradle ];
  NIX_LD_LIBRARY_PATH = lib.makeLibraryPath [
    stdenv.cc.cc
    glib
    openssl
    nss
    nspr
    xorg.libxcb
  ];
  NIX_LD = lib.fileContents "${stdenv.cc}/nix-support/dynamic-linker";
  shellHook = ''
    eval "$extras";
  '';
  extras = ''
    export PATH=$PATH:~/Downloads/
  '';
}

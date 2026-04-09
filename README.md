Community continuation of an unmaintained project

# Zip CLI Tool Continuation
A simple command-line tool for zipping and unzipping files and directories
## Installation
You will need to add the tool to your PATH first:

**Windows**
```powershell
$env:Path += ";C:\path\to\zip-cli-tool"
```
**Linux/Mac**
```bash
export PATH="$PATH:/path/to/zip-cli-tool"
```
## Usage
To zip a file or directory:
```bash
zip-cli-tool -z <source> <destination>
```
To unzip a file:
```bash
zip-cli-tool -uz <source> <destination>
```
To modify the zip file:
```bash
zip-cli-tool -m <zip-file> <file-to-add>
```
To delete a file from the zip:
```bash
zip-cli-tool -d <zip-file> <file-to-delete>
```
To show help:
```bash
zip-cli-tool -h
```
To show the installed version:
```bash
zip-cli-tool -v
```
## Examples
To zip a directory:

```bash
zip-cli-tool -z /path/to/directory /path/to/archive.zip
```
To unzip an archive:
```bash
zip-cli-tool -uz /path/to/archive.zip /path/to/destination
```
## License

This project is a continuation of:
https://github.com/Leenocktopus/zip-cli-tool

The original project did not include a license

This repository applies a modified MIT License only to changes and additions made in this continuation

Credits to the original author: Leenocktopus

See the LICENSE file for details

## Tested on
- Windows by [the original author](https://github.com/Leenocktopus)
- Arch Linux by [dervarex](https://github.com/dervarex)

You can help me by testing it on other platforms and reporting any issues you find!

My discord: [click here](https://discord.gg/cUBWnbPAng)

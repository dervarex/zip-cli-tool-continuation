# Zip CLI Tool
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
zip-cli-tool zip /path/to/directory /path/to/archive.zip
To unzip an archive:
bashzip-cli-tool unzip /path/to/archive.zip /path/to/destination
```

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
It was forked from [com.leandoer](https://github.com/Leenocktopus/zip-cli-tool) and continued by dervarex after 6 years of inactivity at the GitHub repository.

## Tested on:
- Windows ?? by [the original author](https://github.com/Leenocktopus)
- Archlinux by [dervarex](https://github.com/dervarex)

You can help me by testing it on other platforms and reporting any issues you find!

My discord: [click here](https://discord.gg/cUBWnbPAng)
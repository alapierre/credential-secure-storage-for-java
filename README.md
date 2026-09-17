# Credential Secure Storage for Java

[![Java CI with Maven](https://github.com/alapierre/credential-secure-storage-for-java/actions/workflows/maven.yml/badge.svg)](https://github.com/alapierre/credential-secure-storage-for-java/actions/workflows/maven.yml)
[![CodeQL](https://github.com/alapierre/credential-secure-storage-for-java/actions/workflows/codeql-analysis.yml/badge.svg)](https://github.com/alapierre/credential-secure-storage-for-java/actions/workflows/codeql-analysis.yml)
[![License](https://img.shields.io/github/license/alapierre/credential-secure-storage-for-java)](LICENSE.txt)

A unified Java API for storing application secrets in credential managers
provided by Windows, Linux, and macOS.

## Project status and provenance

This is an independently maintained fork of
[Microsoft's credential-secure-storage-for-java](https://github.com/microsoft/credential-secure-storage-for-java),
which Microsoft archived in March 2025. The fork continues development,
dependency maintenance, security fixes, and releases under new Maven
coordinates. It is not affiliated with, endorsed by, or supported by
Microsoft.

The original library was derived from the `auth-secure-storage` module of
[Visual Studio Team Services Authentication Library for Java (Preview)](https://github.com/microsoft/vsts-authentication-library-for-java).
The original copyright notices and attribution are retained; see
[NOTICE.txt](NOTICE.txt).

The Java package and module names remain under `com.microsoft.*` for source
and binary compatibility. They do not indicate current Microsoft ownership or
support of this fork.

## Supported stores

| Secret type                                          | Windows Credential Manager | Linux Secret Service (libsecret/GNOME Keyring) | macOS Keychain |
|------------------------------------------------------|----------------------------|------------------------------------------------|----------------|
| Username and password (`StoredCredential`)           | Yes                        | Yes                                            | Yes            |
| OAuth2 access and refresh tokens (`StoredTokenPair`) | Yes                        | Yes                                            | Yes            |
| Personal access token (`StoredToken`)                | Yes                        | Yes                                            | Yes            |

An in-memory, non-persistent store is also available for cases where secure
platform storage is not required.

## Installation

Add the dependency from Maven Central:

```xml
<dependency>
  <groupId>io.alapierre</groupId>
  <artifactId>credential-secure-storage</artifactId>
  <version>1.0.4</version>
</dependency>
```

The former `com.microsoft:credential-secure-storage` coordinates refer to the
original Microsoft releases and are not used for releases of this fork.

## Usage

See the
[credential storage example](sample/src/main/java/com/microsoft/credentialstorage/sample/StoredCredentialApp.java)
for a complete example of selecting a store and saving a credential.

## Development

Requirements:

- JDK 11 or newer
- Maven 3.8 or newer

Run the complete build, including unit and integration tests, with:

```bash
mvn clean verify
```

Some integration tests require the platform credential manager and are
skipped automatically when it is unavailable.

## Contributing

See [CONTRIBUTING.md](CONTRIBUTING.md) for how to propose changes and
[CODE_OF_CONDUCT.md](CODE_OF_CONDUCT.md) for community expectations.

## Security

Do not report suspected vulnerabilities in public issues. See
[SECURITY.md](SECURITY.md) for private reporting instructions and the
supported-version policy.

## License and attribution

The project is distributed under the [MIT License](LICENSE.txt). Original
Microsoft copyright notices are retained, and modifications in this fork are
copyright their respective contributors. See [NOTICE.txt](NOTICE.txt) for
provenance and attribution.

Microsoft and related product names may be trademarks of Microsoft
Corporation. Their use here identifies the origin of the project and does not
imply sponsorship or endorsement.

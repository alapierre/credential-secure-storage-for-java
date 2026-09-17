# Security Policy

## Supported Versions

Only the latest released version of `credential-secure-storage` is supported.
Please upgrade to the latest release before reporting an issue.

The archived `com.microsoft:credential-secure-storage` releases are not
maintained by this project. Supported releases of this fork use the
`io.alapierre:credential-secure-storage` coordinates.

## Reporting a Vulnerability

Please **do not** open a public GitHub issue for security vulnerabilities.

Instead, use GitHub's private vulnerability reporting: go to the
[Security tab](https://github.com/alapierre/credential-secure-storage-for-java/security)
of this repository and select **Report a vulnerability**. This opens a
private advisory visible only to the maintainer, so the issue can be
discussed and fixed before it is disclosed publicly.

We aim to acknowledge new reports within a few days and to publish a fix or
mitigation as soon as reasonably possible, coordinating the disclosure
timeline with the reporter.

Include the affected version and platform, reproduction steps, impact, and a
proof of concept when it is safe to do so. Do not include real credentials or
other users' sensitive data.

## Scope

Security issues of particular interest include:

- Secrets being logged, leaked, retained in memory unnecessarily, or stored
  in an insecure fallback without the caller's knowledge.
- Incorrect native interoperation with Windows Credential Manager, Linux
  Secret Service/libsecret, GNOME Keyring, or macOS Keychain.
- Authentication, authorization, or isolation problems that allow one
  application or account to access another's stored secret.
- Unsafe handling of malformed keys, account names, secret values, or native
  library responses.
- Supply-chain integrity of artifacts published under the
  `io.alapierre:credential-secure-storage` coordinates.

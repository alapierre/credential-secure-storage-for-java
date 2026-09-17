# Contributing to Credential Secure Storage for Java

Thanks for considering a contribution. This document covers how to propose
changes, what the project expects, and how to get a pull request merged.

## Before you start

- For anything beyond a small fix, open an issue first so the approach can be
  discussed before you invest time in an implementation.
- Security vulnerabilities must **not** be reported as public issues. See
  [SECURITY.md](SECURITY.md) for private reporting instructions.
- Participation in this project is governed by the
  [Code of Conduct](CODE_OF_CONDUCT.md).

## Project scope and compatibility

The project provides one API over native credential stores on Windows, Linux,
and macOS. Changes to shared APIs or models must account for all supported
platforms, even when the implementation is platform-specific.

The `com.microsoft.*` Java package and module names are retained for
compatibility with users of the original library. Changing them requires a
separate compatibility and migration plan.

## Development setup

The build requires JDK 11 or newer and Maven 3.8 or newer.

```bash
mvn clean verify
```

The command runs compilation, Checkstyle, unit tests, Javadocs, packaging,
and integration tests. Platform-specific integration tests are skipped when
the required native credential manager is unavailable.

When changing a platform implementation, run the relevant integration tests
on that platform whenever possible and describe any testing limitations in
the pull request.

## Making a change

- Keep changes focused; avoid unrelated cleanup in bug fixes.
- Add or update tests together with production code.
- Preserve existing public API behavior unless the change has been discussed
  as a breaking change.
- Treat secret values carefully: do not log them, retain unnecessary copies,
  or include real credentials in tests.
- Document new public APIs and update `README.md` for user-visible behavior.
- Keep native JNA mappings consistent with the corresponding platform ABI.
- Do not copy Microsoft's copyright header into newly written files. Authors
  may identify themselves in class Javadoc, but this is not required.

## Commit messages

Use a short, imperative summary line and keep the body, if any, focused on why
the change was made.

## Submitting a pull request

1. Fork the repository and create a branch from `main`.
2. Make the change and add appropriate tests and documentation.
3. Ensure `mvn clean verify` passes.
4. Open a pull request describing the change, its motivation, affected
   platforms, and how it was tested. Link the related issue, if any.

A maintainer will review the pull request. Please respond to review comments
so the change can be completed while its context is still fresh.

## Contribution licensing

This project does not use the Microsoft Contributor License Agreement or the
Microsoft CLA bot. By submitting a contribution, you represent that you have
the right to submit it and agree that it may be distributed under the
[MIT License](LICENSE.txt) applicable to this project.

## AI-assisted contributions

AI-assisted contributions are welcome, but contributors remain responsible
for understanding, reviewing, testing, and being able to explain everything
they submit. Do not submit generated changes that you have not verified.

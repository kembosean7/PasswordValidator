# Password Security Checker
This Python program checks whether a given password meets common security standards. The **isPasswordSecure** method ensures that the password is strong enough by validating its length, character variety, and other essential security factors.

## Function Overview
The **isPasswordSecure** method function verifies if a password is secure based on the following criteria:

- Verifies if the password is at least 8 characters long.
- Ensures the password contains at least:
    - One lowercase letter.
    - One uppercase letter.
    - One digit.
    - One special character (e.g., `!`, `@`, `#`, etc.).
- Spaces are removed from the password before validation.
- Returns `True` if the password is secure; otherwise, returns `False`.
At least one special character (such as !, @, #, etc.).
Spaces are removed from the password before checking.
If the password meets all these criteria, the function returns True; otherwise, it returns False.
# for run this first install cryptography by "pip install cryptography"

from cryptography.fernet import Fernet

key=Fernet.generate_key()
f= Fernet(key)
word = input("Enter any string/word \n")
word = bytes(word, 'utf-8')
crypt_word = f.encrypt(word)
print(f"Encrypted ={crypt_word}")
decrypt_word = f.decrypt(crypt_word)
print(f"decrypted ={decrypt_word}")

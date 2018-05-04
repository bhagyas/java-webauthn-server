package com.yubico.webauthn

import java.util.Optional

import com.yubico.webauthn.data.Base64UrlString


trait CredentialRepository {

  def lookup(credentialId: Base64UrlString, userHandle: Optional[Base64UrlString]): Optional[RegisteredCredential]
  def lookupAll(credentialId: Base64UrlString): Set[RegisteredCredential]

}

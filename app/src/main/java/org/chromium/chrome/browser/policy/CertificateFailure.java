
// Copyright 2017 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../chrome/browser/android/policy/policy_auditor.cc

package org.chromium.chrome.browser.policy;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    CertificateFailure.NONE, CertificateFailure.UNSPECIFIED, CertificateFailure.UNTRUSTED,
    CertificateFailure.REVOKED, CertificateFailure.NOT_YET_VALID, CertificateFailure.EXPIRED,
    CertificateFailure.UNABLE_TO_CHECK_REVOCATION_STATUS
})
@Retention(RetentionPolicy.SOURCE)
public @interface CertificateFailure {
  int NONE = 0;
  int UNSPECIFIED = 1;
  int UNTRUSTED = 2;
  int REVOKED = 3;
  int NOT_YET_VALID = 4;
  int EXPIRED = 5;
  int UNABLE_TO_CHECK_REVOCATION_STATUS = 6;
}
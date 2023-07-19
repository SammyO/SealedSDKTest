package com.oddhov.sealedsdktest

interface SampleResult {
    object SampleOneSuccess: SampleResult, OperationOne

    object SampleOneError: SampleResult, OperationOne

    object SampleTwoSuccess: SampleResult, OperationTwo

    object SampleTwoError: SampleResult, OperationTwo

    sealed interface OperationOne

    sealed interface OperationTwo
}
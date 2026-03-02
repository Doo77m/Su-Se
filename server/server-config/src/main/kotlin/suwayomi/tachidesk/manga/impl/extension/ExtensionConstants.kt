package suwayomi.tachidesk.manga.impl.extension

val repoMatchRegex =
    """(?:https?:\/\/|localhost:?\d*)(?>www\.|raw\.)?(github|githubusercontent|localhost)\.com?\/([^\/]+)\/([^\/]+)(?>(?>(?:\/tree|\/blob)?)?\/([^\/\n]*))?(?>\/([^\/\n]*\.json)?)?"""
        .toRegex()

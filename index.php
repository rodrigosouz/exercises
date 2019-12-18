<?php
$header = [
   'alg' => 'HS256',
   'typ' => 'JWT'

];

$header = json_encode($header);
$header = base64_encode($header);
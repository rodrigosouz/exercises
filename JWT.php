<?php

$key = 'bob-esponja';

$header = [
     'typ' => 'JWT'
      'alg' => 'H256'

];

$header = json_encode($header);
$header = base64_encode($header);

print_r($header);exit;

$payload = [];

$secret = '';